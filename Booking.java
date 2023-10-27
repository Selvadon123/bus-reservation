package BusResveration;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {
    public String passenger_name;
    public int bus_no;
    Date dates;
    Booking() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the passenger name.....");
        passenger_name = sc.next();
        System.out.println("Enter the bus number....");
        bus_no=sc.nextInt();
        //System.out.println(bus_no);
        System.out.println("Enter the date in dd-mm-yyyy");
        String str=sc.next();
        SimpleDateFormat sm = new SimpleDateFormat("dd-MM-yyyy");
        dates=sm.parse(str);
    }
    public boolean isAvailable() throws SQLException {
          BusDAO busDAO = new BusDAO();
          int capacity=busDAO.getCapacity(bus_no);
          BookingDAO bookingDAO = new BookingDAO();
          int booked = bookingDAO.getBookedCount(bus_no,dates);
//          System.out.println(bus_no);
//          for(Bus bus:buses)
//          {
//              if(bus.getBus_no()==bus_no)
//              {
//                  capacity=bus.getCapacity();
//              }
//              //System.out.println(capacity);
//          }
//          int booked=0;
//          for(Booking b:bookings)
//          {
//              if(b.bus_no==bus_no && b.dates.equals(dates))
//              {
//                  booked++;
//              }
//          }
          //System.out.println(bus_no);
          return booked<capacity?true:false;
    }
}
