package BusResveration;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.*;
public class BusDemo {
    public static void main(String[] args)  {
//        ArrayList<Bus>buses=new ArrayList<>();
//        ArrayList<Booking>bookings=new ArrayList<>();
//        buses.add(new Bus(1,true,2));
//        buses.add(new Bus(2,false,50));
//        buses.add(new Bus(3,true,48));
//        for(Bus b:buses)
//        {
//            b.businfo();
//        }
        BusDAO b = new BusDAO();
        try {
            b.displaybusinfo();
            int user_no = 1;
            Scanner sc = new Scanner(System.in);
            while (user_no == 1) {
                System.out.println("Enter 1 to continue or 2 to exit");
                user_no = sc.nextInt();
                if (user_no == 1) {
                    Booking booking = new Booking();
                    if (booking.isAvailable()) {
                        //bookings.add(booking);
                        BookingDAO bookingDAO = new BookingDAO();
                        bookingDAO.addBooking(booking);
                        System.out.println("Your ticket is confirmed");
                    } else {
                        //System.out.println(booking.bus_no);
                        System.out.println("Sorry The bus is full try another");
                    }
                }
            }
            sc.close();
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
/* JDBC acts as an interface between java program and database(make theie communication easier)
     API act as an interface for both the software communication

 */