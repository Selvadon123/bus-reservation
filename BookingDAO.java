package BusResveration;
import java.sql.*;
import java.util.Date;

public class BookingDAO {
    public int getBookedCount(int bus_no, Date date) throws SQLException
    {
           String query = "select count(passenger_name) from Booking where bus_no=? and dates=?";
           Connection con = DbConnection.getConnection();
           PreparedStatement ps = con.prepareStatement(query);
           java.sql.Date sqldate = new java.sql.Date(date.getTime());  // To convert java date to sql date
           ps.setInt(1,bus_no);
           ps.setDate(2,sqldate);
           ResultSet rs = ps.executeQuery();
           rs.next();
           return rs.getInt(1);
    }
    public void addBooking(Booking booking) throws SQLException
    {
        String query = "insert into Booking values(?,?,?)";
        Connection con = DbConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(query);
        java.sql.Date sqldate = new java.sql.Date(booking.dates.getTime());
        ps.setString(1,booking.passenger_name);
        ps.setInt(2,booking.bus_no);
        ps.setDate(3,sqldate);
        ps.executeUpdate();
    }
}
