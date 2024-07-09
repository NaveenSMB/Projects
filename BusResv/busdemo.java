package BusResv;
import java.util.*;
import java.util.ArrayList;
public class busdemo{
    public static void main(String[] args) {
        ArrayList<Bus> buses=new ArrayList<Bus>();
        ArrayList<booking> bookings=new ArrayList<booking>();
        buses.add(new Bus(1, false, 2));
        buses.add(new Bus(2, true, 70));
        buses.add(new Bus(3, false, 30));
        buses.add(new Bus(4, true, 60));
        for(Bus b:buses){
            b.displaybusinfo();
        }
        int userop=1;
        Scanner in = new Scanner(System.in);
            while(userop==1){
                System.out.println("Enter 1 to book and 2 to Exit the process");
                userop=in.nextInt();
                if(userop==1){
                    booking booking=new booking();
                    if(booking.isAvailable(buses,bookings)){
                        bookings.add(booking);
                        System.out.println("Your booking is confirmed");
                    }
                    else{
                        System.out.println("Sorry! Bus is full try another bus or date :) ");
                    }
                }
            }
        }
    }