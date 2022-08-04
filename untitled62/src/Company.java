import java.util.ArrayList;

public class Company {


    static void display_employee(ArrayList<Employee> employeeArrayList)
    {
        System.out.println("\n--------------Employee List---------------\n");
        System.out.println(String.format("%-10s%-20s%-10s%-10s", "ID","Name", "Branch","Branch Name"));


        for(Employee e : employeeArrayList)
        {
            System.out.println(String.format("%-10s%-20s%-10s%-10s",e.getId(),e.getName(),e.getBranch_id(),e.getEmployee_branch()));
        } }


    static void display_transportation(ArrayList<Transportation> transportationArrayList)
    {
        System.out.println("\n--------------Transportation Personel List---------------\n");
        System.out.println(String.format("%-10s%-10s%-10s%-10s", "ID","Name", "Branch","Branch ID"));
        for(Transportation e : transportationArrayList)
        {
            System.out.println(String.format("%-10s%-10s%-10s%-10s",e.getTransportation_id(),e.getTransportation_name(),e.getTransportation_branch(),e.getBranch_id()));
        } }
}
