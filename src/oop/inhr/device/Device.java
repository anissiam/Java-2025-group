package oop.inhr.device;


//

public class Device {                        // Samsung        MSI           IPhone
    //      \
    //    Ultra25
    int ram ;
    String cpu;
    int storage;

    public void printDevice(){
        System.out.println(ram + "GB " + storage  + "TB  " + cpu );
    }

    @Override
    public String toString() {
        return "Device{" +
                "ram=" + ram +
                ", cpu='" + cpu + '\'' +
                ", storage=" + storage +
                '}';
    }
}
