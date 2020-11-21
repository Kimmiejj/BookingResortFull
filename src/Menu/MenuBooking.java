package Menu;

import Addition.AdminPassword;
import bookedresort.BookedResort;
import java.util.Scanner;
import java.time.LocalDateTime;

public class MenuBooking {

    BookedResort test = new BookedResort(0);
    AdminPassword apss = new AdminPassword();
    LocalDateTime date = LocalDateTime.now();

    int temp;

    public MenuBooking() {

        StartApp();
    }

    public void StartApp() {
        test = new BookedResort(10);
        temp = test.getresortlength() / 2;
        for (int room = 1; room <= test.getresortlength(); room++) {
            test.setRoom(room, "Room " + room, 0, 0, "None");
            if (room <= temp) {
                test.setSuite(room);
            } else {
                test.setDeluxe(room);
            }
        }
        ResortApp();
    }

    public void ResortApp() {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n");
         System.out.print("Admin User :");
                        String inputAdminUser =sc.nextLine();
                        if(inputAdminUser.equals(apss.getAdminUser())){
                            System.out.print("Admin Password :");
                        }else {
                            System.out.println("Admin User incorrect!!");
                             ResortApp();
                        }
                        try{
                          int inputAdminpassword =sc.nextInt();
                            if  (inputAdminpassword == apss.getAdminPassword()){
                                System.out.println("\n");
                                 System.out.println("Correct>>");
                        
                        }

                        }catch(Exception ex) {
                          System.out.println(" Password Incorrect!!" );
                         sc.reset();
                          sc.next();
                         ResortApp();
                        }
                          
                           
        try {

            while (true) {
                System.out.println("\n");
                System.out.print("[Choose Number Menu] \n");
                System.out.print("1.) Check Status Room \n");
                System.out.print("2.) Check in \n");
                System.out.print("3.) Check out \n");
                System.out.print("4.) Close Program \n");
                System.out.println("-------------------------\n\n");
                System.out.print("Choose nunber Menu :");

                int chooseMenu = sc.nextInt();

                switch (chooseMenu) {
                    case 1:

                        System.out.println("Status Room\n");

                        for (int i = 1; i <= test.getresortlength(); i++) {

                            System.out.println(test.getRoomDetail(i));

                        }
                        break;
                    //------------------------------------------------------------------//        

                    case 2:
                       
                        
                        System.out.print("Plese Enter Password :");
                        int inputCheckin = sc.nextInt();
                        if (inputCheckin == apss.getAdminPassword()) {

                            System.out.print("Room Number :  ");
                            int room_number = sc.nextInt();
                            sc.nextLine();
                            if (test.getRoomStatus(room_number) == true) {
                                System.out.print("Owner Id : ");
                                int owner_id = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Owner Name :  ");
                                String owner_Name = sc.nextLine();
                                System.out.print("Number of Customer :");
                                int numberCustomer = sc.nextInt();

                                if (numberCustomer <= 2) {
                                    test.checkin(room_number, owner_Name, owner_id, numberCustomer, "DateandTime" + date);
                                } else {
                                    System.out.println(" [EXCESS!!] ");
                                }
                                if (room_number <= temp) {
                                    test.setSuite(room_number);
                                } else {
                                    test.setDeluxe(room_number);
                                }
                                System.out.println("\n");
                                System.out.println("[COMPETE]");
                            } else {
                                System.out.println("\n\n");
                                System.out.println("[RENTED!!]");
                            }
                        }
                        break;
                    //-----------------------------------------------------------//

                    case 3:
                        
                        System.out.print("Plese Enter Password :");
                        int inputCheckout = sc.nextInt();
                        if (inputCheckout == apss.getAdminPassword()) {
                            System.out.print("Room Number : ");
                            int checkout_number = sc.nextInt();
                            sc.nextLine();
                            test.checkout(checkout_number);
                            System.out.println("\n");
                            System.out.println("[COMPETE]");
                        } else {
                            System.out.println("\n");
                            System.out.println("[NO  BOOKING]");
                            System.out.println("\n");
                            System.out.println("We can't proceed!!");
                        }

                        break;
                    //-----------------------------//

                    case 4:
                        System.exit(0);
                        break;
                    //---------------------------------------------------------------------//

                    //----------------------------------------------------------------------//
                }
            }
        } catch (Exception ex) {
            System.out.println("Input incorrect! Please fill in again : ");
            sc.reset();
            sc.next();
            ResortApp();
        }

    }
    }

