import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.sql.*;

public class BlobFiles {
    public static void main(String[] args) throws ClassNotFoundException {
        String username = "testjdbc";
        String password = "123456";
        String connectionURL = "jdbc:postgresql://localhost:5432/testjdbc";
        Class.forName("org.postgresql.Driver");

        try (Connection connection = DriverManager.getConnection(connectionURL, username, password);
             Statement statement = connection.createStatement()) {
             statement.executeUpdate("" +
                    "CREATE TABLE gallery(" +
                    "id int8 PRIMARY KEY NOT NULL," +
                    "name VARCHAR(64) NOT NULL," +
                    "img bytea );");

            File file = new File("C:\\pro\\image.jpg");
            FileInputStream in = new FileInputStream(file);

            PreparedStatement preparedStatement = connection.prepareStatement(
                    "insert into gallery(id, NAME , img)" +
                            "VALUES (?, ?, ?);");
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "firstImage");
            //preparedStatement.setCharacterStream(3, in, file.length());
            preparedStatement.execute();

            ResultSet resultSet = statement.executeQuery("select * from gallery");
            while (resultSet.next()){
                InputStream binaryStream = resultSet.getBinaryStream(3);
                BufferedImage read = ImageIO.read(binaryStream);
                File out = new File("C:\\pro\\saved.jpg");
                ImageIO.write(read, "jpg", out);
            }
            in.close();



        } catch (SQLException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
