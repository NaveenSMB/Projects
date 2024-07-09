package BusResv;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class booking {
    String passengername;
    int busno;
    Date date;

    booking(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the passenger name: ");
        passengername=in.next();
        System.out.println("Enter Bus no: ");
        busno=in.nextInt();
        System.out.println("Enter date dd-mm-yyyy: ");
        String dateinput=in.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        try {
            date=dateFormat.parse(dateinput);
        } catch (ParseException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    public boolean isAvailable(ArrayList<Bus> buses,ArrayList<booking> bookings){
        int capacity=0;
        for(Bus bus:buses){
            if(bus.getBusno()==busno){
                capacity=bus.getCapacity();
            }
        }
        int booked=0;
        for(booking b:bookings){
            if(b.busno==busno && b.date.equals(date)){
                booked++;
            }
        }
        return booked<capacity?true:false;
    }
}
