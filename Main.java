package Main;

import java.util.Scanner;

public class Main {
    public static String who;
    public static String Username;
    public static String Password;
    public static void main(String[] args) {


        while (true) {
            System.out.println("What are you? Admin/Customer");
            Scanner sc = new Scanner(System.in);
            who = sc.nextLine();

            if (who.equals("Admin")) {
                System.out.println("Enter your username: ");
                Username = sc.next();


                if (Username.equals("Utsav")) {
                    System.out.println("Enter your password");
                    Password = sc.next();
                    if (Password.equals("Password")) {
                        Admin.menu();
                    } else {
                        System.out.println("Wrong password");
                    }
                }
            }
            else if(who.equals("Customer")){
                    System.out.println("Welcome to Costumer Page:");
                    Customer.cmenu();
                } else {
                    System.out.println("Wrong input please enter again: ");
                }
            }
            }
    }


