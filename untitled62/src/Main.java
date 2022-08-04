import java.util.ArrayList;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int id;

        String name;
        String branch;
        String current;
        ArrayList<Shipment> shipmentArrayList = new ArrayList<>();
        shipmentArrayList.add(new Shipment(1,"Sena ","Yusuf",1,"Canakkale"));
        shipmentArrayList.add(new Shipment(2,"Selma ","Yasif",1,"Gebze"));
        shipmentArrayList.add(new Shipment(3,"Sema ","Yasin",1,"Istanbul"));
        shipmentArrayList.add(new Shipment(4,"Sima ","Yunus",1,"Canakkale"));

        ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();
        ArrayList<Transportation> transportationArrayList = new ArrayList<Transportation>();

        ArrayList<Customer> customerArrayList = new ArrayList<Customer>();


        //ArrayList<Transportation> transportationArrayList = new ArrayList<Transportation>();

        Scanner scan = new Scanner(System.in);


        Scanner scanner = new Scanner(System.in);
        ArrayList<Branch> branchArrayList = new ArrayList<Branch>();


        String mainmenu= ("Enter the system as a:  \n 1-Administrator \n " +
                "2-Branch employee \n " +
                "3-Transportation personnel \n" +
                "4-Customer\n" +
                "5-Exit");
        boolean control_exit=true;
        while (control_exit==true){
            System.out.println(mainmenu);
        int enter = scanner.nextInt();


        switch (enter) {
            case 1:
                boolean controlflag=true;


                while (controlflag==true) {
                    System.out.println("\n---------Welcome the X Cargo Company------\n");
                    String menu = ("1). Add Employee to the DataBase\n" +
                            "2). Search for Employee\n" +
                            "3). Delete Employee \n" +
                            "4). List All Employees \n" +
                            "5). EXIT\n" +
                            "6). Add Transportation Personnel \n " +
                            "7). Search for Transportation Personnel \n" +
                            "8). Remove Transportation Personnel \n " +
                            "9). List All Transportation Personnel \n" +
                            "10) . Add Branch \n " +
                            "11) . Remove Branch \n" +
                            "12). List All Branches");
                    System.out.println(menu);


                    System.out.println("Enter your choice : ");

                    int ch = scan.nextInt();


                    switch (ch) {

                        case 1:

                            System.out.println("\nAdd Employee to the list:\n");
                            System.out.println("Enter ID :");
                            id = scan.nextInt();
                            System.out.println("Enter Name :");
                            name = scan.next();
                            System.out.println("Enter Branch Name: ");
                            branch = scan.next();
                            boolean a = false;
                            for (int i = 0; i < branchArrayList.size(); i++) {

                                if (branchArrayList.get(i).getBranch_name().equals(branch)) {
                                    employeeArrayList.add(new Employee(id, name, branchArrayList.get(i).getBranch_id(), branch));
                                    Company.display_employee(employeeArrayList);
                                    a = true;
                                    break;
                                }

                            }
                            if (!a) {
                                System.out.println("This branch does not exist.TRY AGAIN!");
                            }


                            break;
                        case 2:
                            System.out.println("Enter the Employee ID to search :");
                            id = scan.nextInt();
                            int i = 0;
                            for (Employee e : employeeArrayList) {
                                if (id == e.getId()) {
                                    System.out.println(e + "\n");
                                    i++;
                                }
                            }
                            if (i == 0) {
                                System.out.println("\nEmployee is not available, Please enter a valid ID!!");
                            }

                            break;

                        case 3:
                            System.out.println("\nEmployee ID:");
                            id = scan.nextInt();
                            int k = 0;
                            try {
                                for (Employee e : employeeArrayList) {
                                    if (id == e.getId()) {
                                        employeeArrayList.remove(e);
                                        Company.display_employee(employeeArrayList);
                                        k++;
                                    }
                                }
                                if (k == 0) {
                                    System.out.println("\nEmployee is not available, Please enter a valid ID!!");
                                }
                            } catch (Exception ex) {
                                System.out.println(ex);
                            }

                            break;
                        case 4:

                            Company.display_employee(employeeArrayList);
                            break;

                        case 5:


                            System.out.println("\nFiles are saved");

                            controlflag=false;

                            control_exit=true;




                        case 6:

                            System.out.println("Enter Transportation Personel ID :");
                            id = scan.nextInt();
                            System.out.println("Enter Name :");
                            name = scan.next();
                            System.out.println("Enter Branch: ");
                            branch = scan.next();
                            boolean p = false;
                            for (int nn = 0; nn < branchArrayList.size(); nn++) {

                                if (branchArrayList.get(nn).getBranch_name().equals(branch)) {

                                    transportationArrayList.add(new Transportation(id, name, branchArrayList.get(nn).getBranch_id(), branch));
                                    Company.display_transportation(transportationArrayList);
                                    p = true;
                                    break;
                                }

                            }
                            if (!p) {
                                System.out.println("This branch does not exist.TRY AGAIN!");
                            }

                            break;
                        case 7:
                            System.out.println("Enter the Transport Personel ID to search :");
                            id = scanner.nextInt();
                            int i1 = 0;
                            for (Transportation e : transportationArrayList) {
                                if (id == e.getTransportation_id()) {
                                    System.out.println(e + "\n");
                                    i1++;
                                }
                            }
                            if (i1 == 0) {
                                System.out.println("\nEmployee is not available, Please enter a valid ID!!");
                            }

                            break;
                        case 8:
                            System.out.println("\nPersonnel ID :");
                            id = scan.nextInt();
                            int k1 = 0;
                            try {
                                for (Transportation e : transportationArrayList) {
                                    if (id == e.getTransportation_id()) {
                                        transportationArrayList.remove(e);
                                        Company.display_transportation(transportationArrayList);
                                        k1++;
                                    }
                                }
                                if (k1 == 0) {
                                    System.out.println("\nEmployee is not available, Please enter a valid ID!!");
                                }
                            } catch (Exception ex) {
                                System.out.println(ex);

                            }
                            break;
                        case 9:

                            Company.display_transportation(transportationArrayList);

                            break;

                        case 10:

                            System.out.println("Enter Branch ID :");
                            id = scan.nextInt();
                            System.out.println("Enter Branch Name :");
                            name = scan.next();

                            branchArrayList.add(new Branch(id, name));
                            Admin.display3(branchArrayList);

                            break;
                        case 11:
                            System.out.println("\nBranch ID :");
                            id = scan.nextInt();
                            int g = 0;
                            try {
                                for (Branch e : branchArrayList) {
                                    if (id == e.getBranch_id()) {
                                        branchArrayList.remove(e);
                                        Admin.display3(branchArrayList);
                                        g++;
                                    }
                                }
                                if (g == 0) {
                                    System.out.println("\nEmployee is not available, Please enter a valid ID!!");
                                }
                            } catch (Exception ex) {
                                System.out.println(ex);
                            }

                            break;
                        case 12:
                            Admin.display3(branchArrayList);

                            break;

                        default:
                            System.out.println("\nEnter a correct choice from the List :");

                            break;
                    }


                }




            case 2:

                Scanner sca = new Scanner(System.in);
                System.out.println("Employee ID: ");
                int id_employee = sca.nextInt();
                boolean b = false;
                for (int i = 0; i < employeeArrayList.size(); i++) {

                    if (employeeArrayList.get(i).getId() == id_employee) {
                        System.out.println("Succesfully entered the system");
                        b = true;

                    }

                }

                if (!b) {
                    System.out.println("This employee ID does not exist.TRY AGAIN!");
                    break;
                }

                do {
                    System.out.println("1). Add Shipment \n" +
                            "2). Remove the Shipment\n" +
                            "3). Add Cargo Status: \n" +
                            "4). EXIT\n" +
                            "5). List Customers\n" +
                            "6).List Shipment Informations");
                    System.out.println("Enter your choice : ");
                    int chf = scan.nextInt();

                    switch (chf) {
                        case 1:
                            System.out.println("\n Enter a Shipment Id:\n");

                            id = scan.nextInt();
                            System.out.println("Enter Receiver Name :");
                            name = scan.next();

                            for (int i = 0; i < shipmentArrayList.size(); i++) {

                                if (shipmentArrayList.get(i).getReceiver().equals(name)) {
                                    customerArrayList.add(new Customer(id, name, customerArrayList.get(i).getSender_name(), customerArrayList.get(i).getCustomer_id(), customerArrayList.get(i).getCurrent_place_customer(), customerArrayList.get(i).getShipment_id()));
                                    Employee.display_customer(customerArrayList);
                                }

                            }
                            break;
                        case 2:
                            System.out.println("\nDelete Customer :");
                            id = scanner.nextInt();
                            int j = 0;
                            try {
                                for (Customer g : customerArrayList) {
                                    if (id == g.getCustomer_id()) {
                                        customerArrayList.remove(g);
                                        Employee.display_customer(customerArrayList);
                                        j++;
                                    }
                                }
                                if (j == 0) {
                                    System.out.println("\nCustomer is not available, Please enter a valid ID!!");
                                }
                            } catch (Exception ex3) {
                                System.out.println(ex3);
                            }
                            break;
                        case 3:
                            System.out.println("Shipment ID: ");
                            int idm = scan.nextInt();
                            boolean c = false;
                            for (int l = 0; l < shipmentArrayList.size(); l++) {

                                if (shipmentArrayList.get(l).getId() == (idm)) {
                                    System.out.println("Successfully has been entered the system");
                                    System.out.println("Enter a delete process 2 then for add process 1: ");
                                    int swc1 = scan.nextInt();

                                    switch (swc1) {
                                        case 2:
                                            System.out.println("\nDelete Shipment :");
                                            id = scanner.nextInt();
                                            int p = 0;
                                            try {
                                                for (Shipment e : shipmentArrayList) {
                                                    if (id == e.getId()) {
                                                        shipmentArrayList.remove(e);
                                                        Admin.display4(shipmentArrayList);
                                                        p++;
                                                    }
                                                }
                                                if (p == 0) {
                                                    System.out.println("\nShipment is not available, Please enter a valid ID!!");
                                                }
                                            } catch (Exception ex3) {
                                                System.out.println(ex3);
                                            }

                                        case 1:
                                            System.out.println("\n Enter a new ID for Shipment:\n");

                                            id = scan.nextInt();

                                            System.out.println("Update the Current Place ");
                                            current = scan.next();
                                            boolean u = false;
                                            for (int i = 0; i < shipmentArrayList.size(); i++) {

                                                if (shipmentArrayList.get(i).getCurrent_place().equals(current)) {
                                                    shipmentArrayList.add(new Shipment(id, shipmentArrayList.get(i).getSender(), shipmentArrayList.get(i).getReceiver(), shipmentArrayList.get(i).getCurrent_place_id(), current));
                                                    Admin.display4(shipmentArrayList);
                                                    break;
                                                }
                                            }

                                        u = true;
                                        break;

                                    }

                                }


                            }


                            if (!c) {
                                System.out.println("This shipment ID does not exist.TRY AGAIN!");
                            }


                            break;

                        // if(idm==Shipment.id){

                        // System.out.println("Shipment status changed ------Current Status: ");
                        // }
                        case 5:

                            Employee.display_customer(customerArrayList);
                            break;
                        case 4:


                            System.out.println("\nFiles are saved");

                            //System.exit(0);

                            break;

                        case 6:

                            Admin.display4(shipmentArrayList);
                            break;
                    }


                }
                while (true);
            case 4:

                System.out.println("Enter the shipment ID to show the Cargo Status: ");
                int sc = scan.nextInt();


                boolean u = false;
                for (int i = 0; i < shipmentArrayList.size(); i++) {

                    if (shipmentArrayList.get(i).getId() == (sc)) {
                        System.out.println("Succesfully has been entered the system\n");
                        System.out.println("Cargo Information: \n");
                        System.out.println("Sender-----" + shipmentArrayList.get(i).getSender());
                        System.out.println("Receiver----" + shipmentArrayList.get(i).getReceiver());
                        System.out.println("Current Place-----" + shipmentArrayList.get(i).getCurrent_place());
                    }
                    break;


                }
                break;
            case 5:
                System.out.println("System has been closed successfully ");
                System.exit(0);
            case 3:
                System.out.println("1).Update the Shipment : \n" +
                        "2). EXIT");
                int ff = scanner.nextInt();
                switch (ff) {
                    case 1:

                        System.out.println("Enter the personnel ID: ");
                        id = scan.nextInt();
                        for (int i = 0; i < transportationArrayList.size(); i++) {

                            if (id == transportationArrayList.get(i).getTransportation_id()) {
                                System.out.println("Succesfully has been entered the system ");

                                System.out.println("Firstly Enter 2 to delete   ");
                                Scanner scanner1 = new Scanner(System.in);
                                int id5 = scanner1.nextInt();

                                switch (id5) {
                                    case 2:
                                        System.out.println("\nDelete Shipment ID :");
                                        int idk = scanner.nextInt();
                                        int p = 0;
                                        try {

                                            for (Shipment e : shipmentArrayList) {
                                                System.out.println(idk);
                                                if (idk == e.getId()) {
                                                    shipmentArrayList.remove(e);
                                                    Admin.display4(shipmentArrayList);
                                                    p++;
                                                }
                                            }
                                            if (p == 0) {
                                                System.out.println("\nShipment is not available, Please enter a valid ID!!");
                                            }

                                        } catch (Exception ex3) {
                                            System.out.println(ex3);
                                        }
                                        // System.out.println("Enter 1 to add new shipment information");
                                    case 1:
                                        System.out.println("\n Enter a new ID for Shipment:\n");

                                        id = scan.nextInt();
                                        System.out.println("Enter Sender Name :");
                                        name = scan.next();
                                        System.out.println("Enter Receiver Name: ");
                                        branch = scan.next();
                                        System.out.println("Update the Current Place ");
                                        current = scan.next();

                                        shipmentArrayList.add(new Shipment(id, name, branch, shipmentArrayList.get(i).getCurrent_place_id(), current));
                                        Admin.display4(shipmentArrayList);
                                        break;

                                }
                                break;

                            }

                        }
                        u = true;


                        if (!u) {
                            System.out.println("Personnel ID does not exist.TRY AGAIN!");
                            break;
                        }

                    case 2:

                        System.out.println("\nFiles are saved");

                         System.exit(0);

                        break;
                }

            default:
                //why this returns too???
                System.out.println("\nEnter a correct choice from the List :");
        }







    } } }