package BusResveration;

public class Bus {
    private int bus_no;
    private boolean ac;
    private int capacity;

    public int getBus_no() {
        return bus_no;
    }

    public void setBus_no(int bus_no) {
        this.bus_no = bus_no;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public int getCapacity() {   //accessor method
        return capacity;
    }

    public void setCapacity(int capacity) {    //mutator method
        this.capacity = capacity;
    }

    public Bus(int bus_no, boolean ac, int capacity) {
        this.bus_no = bus_no;
        this.ac = ac;
        this.capacity = capacity;
    }
    public void businfo()
    {
        System.out.println("Bus no:"+bus_no+" Ac:"+ac+"Bus capacity"+capacity);
    }
}
