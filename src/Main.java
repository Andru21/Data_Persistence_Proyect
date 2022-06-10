import com.mysql.jdbc.Connection;

public class Main {
    public static void main(String[] args) {
        ConnectionMysql myConnection = new ConnectionMysql();
        try(Connection tryConnection = myConnection.getConnection()) {
        }catch (Exception e){
            System.out.println("Failed Connection because: " + e);
        }
    }
}
