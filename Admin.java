package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Admin {
    public static String clear;
    public static String cast;
    public static String add;
    public static void menu() {
        Scanner ask = new Scanner(System.in);
        int i = 0;
        while(i!=4){
            System.out.println("Please enter given number to perform action: ");
            System.out.println("1:View Product");
            System.out.println("2:Add product");
            System.out.println("3:Remove");
            System.out.println("4:Close");
            i = ask.nextInt();

            switch (i){
                case 1:
                    System.out.println(Product.product);
                    break;
                case 2:
                    Admin.Add(Product.product);
                    break;
                case 3:
                    Admin.Remove(Product.product);
                    break;
                case 4:
                    System.out.println("Please visit again!!");
                    System.exit(0);
                default:
                    System.out.println("Wrong Input");
            }
        }
    }

    public static void Add(ArrayList<String> array) {
        Scanner add = new Scanner(System.in);
        System.out.println("Add your product here: ");
        cast=add.nextLine();
        array.add(cast);
        System.out.println("Added item: "+cast);
        System.out.println(array);
    }

    public static void Remove(ArrayList<String> array) {
        Scanner remove = new Scanner(System.in);
        System.out.println("Product you wanna remove: ");
         clear=remove.nextLine();
        array.remove(clear);
        System.out.println("Removed item: "+clear);
        System.out.println(array);
    }

    public static void product(String cast, String clear) {
        System.out.println("Added product: " + cast);
        System.out.println("Removed product: " + clear);
    }
}
