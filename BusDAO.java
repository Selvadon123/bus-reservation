package BusResveration;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// used to play the stuffs with the databases with some operation
public class BusDAO {
    public void displaybusinfo() throws SQLException {
        String str = "select * from Bus";
        Connection con = DbConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs=st.executeQuery(str);
        while (rs.next()){
            System.out.println("Bus no :"+rs.getInt(1));
            if(rs.getInt(2)==0){
                System.out.println("AC : no ");
            }else{
                System.out.println("AC : yes ");
            }
            System.out.println("Capacity :"+rs.getInt(3));
        }
    }
    public int getCapacity(int id) throws SQLException {
        String query = "select capacity from Bus where id ="+id;
        Connection con = DbConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs=st.executeQuery(query);
        rs.next();
        return rs.getInt(1);
    }
}
