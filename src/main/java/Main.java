import java.util.UUID;
import java.sql.*;

public class Main {
    public static void main (String [] args)
    {
        Connection con = null;
        Statement stm = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbtest", "root", "root");
            //con.setAutoCommit(false);
            String query = "INSERT INTO reservations(id,check_in_date,check_out_date,status) values('dddddddddddddddddd','2022-12-12','2022-12-12','hold')";
            //String query1 = "INSERT INTO guests(id,reservation_id,first_name,last_name) values(?,?,?,?)";
            //stm = con.prepareStatement(query);
            stm = con.createStatement();
            stm.execute(query);
        }catch (Exception throwables) {
            throwables.printStackTrace();
        }

    }

}
