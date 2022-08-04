import java.util.ArrayList;

public class Admin {



    static void display3(ArrayList<Branch> branchArrayList)
    {
        System.out.println("\n--------------Branch List---------------\n");
        System.out.println(String.format("%-10s%-10s", "ID","Name"));
        for(Branch e : branchArrayList)
        {
            System.out.println(String.format("%-10s%-10s",e.getBranch_id(),e.getBranch_name()));
        } }
    static void display4(ArrayList<Shipment> shipmentArrayList)
    {
        System.out.println("\n--------------Shipment List---------------\n");
        System.out.println(String.format("%-10s%-10s%-10s%-50s", "ID","Name", "Name Receiver","Current Place"));
        for(Shipment e : shipmentArrayList)
        {
            System.out.println(String.format("%-10s%-10s%-10s%-50s",e.getId(),e.getSender(),e.getReceiver(), e.getCurrent_place()));
        } }

}