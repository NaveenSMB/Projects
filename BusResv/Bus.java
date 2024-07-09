package BusResv;
public class Bus{
    private int busno;
    private boolean ac;
    private int capacity;
    Bus(int no,boolean ac,int cap){
        this.busno=no;
        this.ac=ac;
        this.capacity=cap;
    }
    public int getBusno() {
        return busno;
    }
    public boolean isAc() {
        return ac;
    }
    public void setAc(boolean ac) {
        this.ac = ac;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int cap) {
        this.capacity = cap;
    }
    public void displaybusinfo(){
        System.out.println("Bus No: "+busno+" "+"Ac: "+ac+" "+"Total Capacity: "+capacity);
    }
}
