import java.sql.*;

public class SQLInjection {
    public static void main(String[] args) throws ClassNotFoundException {
        String username = "testjdbc";
        String password = "123456";
        String connectionURL = "jdbc:postgresql://localhost:5432/testjdbc";
        Class.forName("org.postgresql.Driver");

        try(Connection connection = DriverManager.getConnection(connectionURL, username, password);
            Statement statement = connection.createStatement()) {
            /*statement.executeUpdate("" +
                    "CREATE TABLE users(" +
                    "id int8 PRIMARY KEY NOT NULL," +
                    "name VARCHAR(64) NOT NULL," +
                    "password VARCHAR(64) NOT NULL)");*/

            /*statement.executeUpdate("insert into users" +
                    "(id, name, password)" +
                    "VALUES (1, 'Федя', 'Семёнов')");*/

            String userId = "1";
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "select * from users where id=?");
            preparedStatement.setInt(1, Integer.parseInt(userId));
            ResultSet resultSet = preparedStatement.executeQuery();

            //ResultSet resultSet = statement.executeQuery("select * from users where id=" + userId);

            while (resultSet.next()){
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
