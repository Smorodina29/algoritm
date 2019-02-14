import java.sql.*;

public class StoredProcedure {
    public static void main(String[] args) throws ClassNotFoundException {
        String username = "testjdbc";
        String password = "123456";
        String connectionURL = "jdbc:postgresql://localhost:5432/testjdbc";
        Class.forName("org.postgresql.Driver");

        try (Connection connection = DriverManager.getConnection(connectionURL, username, password);
             Statement statement = connection.createStatement()) {

            CallableStatement callableStatement = connection.prepareCall("{call bookscount(?)}");
            CallableStatement callableStatement2 = connection.prepareCall("{call getbooks(?)}");
            callableStatement.registerOutParameter(1, Types.INTEGER);
            callableStatement2.setInt(1, 1);
            callableStatement.execute();

            System.out.println(callableStatement.getInt(1));
            callableStatement.close();

            if (callableStatement2.execute()){
                ResultSet resultSet = callableStatement2.getResultSet();
                while (resultSet.next()){
                    System.out.println(resultSet.getInt(1));
                    System.out.println(resultSet.getString(2));
                    System.out.println(resultSet.getString(3));
                }
            }
            callableStatement2.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

