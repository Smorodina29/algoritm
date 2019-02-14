import java.sql.*;

public class DateTest {
    public static void main(String[] args) throws ClassNotFoundException {
        String username = "testjdbc";
        String password = "123456";
        String connectionURL = "jdbc:postgresql://localhost:5432/testjdbc";
        Class.forName("org.postgresql.Driver");

        try (Connection connection = DriverManager.getConnection(connectionURL, username, password);
             Statement statement = connection.createStatement()) {
            /*statement.executeUpdate("" +
                    "CREATE TABLE visitors(" +
                    "id int8 PRIMARY KEY NOT NULL," +
                    "user_id INT8 NOT NULL," +
                    "date DATE," +
                    "CONSTRAINT visitors_user_id_fkey\n" +
                            "      FOREIGN KEY (user_id) REFERENCES users (id)\n" +
                            "      ON UPDATE NO ACTION ON DELETE NO ACTION);");*/

            PreparedStatement preparedStatement = connection.prepareStatement(
                    "insert into visitors(id, user_id , date)" +
                            "VALUES (?, ?, ?);");
            preparedStatement.setInt(1, 4);
            preparedStatement.setInt(2, 1);
            preparedStatement.setDate(3, new Date(1849024995));
            preparedStatement.execute();
            System.out.println(preparedStatement);

            ResultSet resultSet = statement.executeQuery("select * from visitors");
            while (resultSet.next()){
                Date date = resultSet.getDate("date");
                System.out.println(date);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
