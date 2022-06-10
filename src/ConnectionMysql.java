import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

public class ConnectionMysql {
    public Connection getConnection(){
        Connection connection = null;
        String jdbcURL = "jdbc:mysql://localhost:3306/app__messages";
        String user = "root";
        String password = "";
        try {
            //Se requiere castear debido aque el metodo se encuentra en la clase implementada por maven
             connection = (Connection) DriverManager.getConnection(jdbcURL,user,password);
            if (connection != null)
                System.out.println("Successful Connection");
        }catch(SQLException e){
            System.out.println("Failed Connection: "+ e);
        }
        return connection;
    }
}


