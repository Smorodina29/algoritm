import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        String username = "testjdbc";
        String password = "123456";
        String connectionURL = "jdbc:postgresql://localhost:5432/testjdbc";
        Class.forName("org.postgresql.Driver");

        try(Connection connection = DriverManager.getConnection(connectionURL, username, password);
            Statement statement = connection.createStatement()){
                /*statement.executeUpdate("" +
                        "CREATE TABLE books(" +
                        "id int8 PRIMARY KEY NOT NULL," +
                        "name VARCHAR(64) NOT NULL," +
                        "author VARCHAR(64) NOT NULL)");*/

                statement.executeUpdate("insert into books" +
                        "(id, name, author)" +
                        "VALUES (2, 'Стивен Кинг', 'Противостаяние')");

            ResultSet resultSet = statement.executeQuery("select * from Books");

            while(resultSet.next()){
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("author"));
                System.out.println("---------");
            }
            } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }
}
