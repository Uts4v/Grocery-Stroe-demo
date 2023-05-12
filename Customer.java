package Main;

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Customer {
    public static String input;
    public static int rate;
    public static void cmenu() {

        Scanner ask = new Scanner(System.in);
        int o = 0;

        while (o!=3) {
            System.out.println("Please enter given number to perform action: ");
            System.out.println("1: View product");
            System.out.println("2: Buy");
            System.out.println("3:Close ");
            o = ask.nextInt();
            ask.nextLine();
            double price=0;

            switch (o) {
                case 1:
                    System.out.println(Product.product);
                    System.out.println("Bannana : Rs 100");
                    System.out.println("Watch : Rs 3000");
                    System.out.println("Bracelet : Rs 1000");
                    System.out.println("Cigar : Rs 500");
                    System.out.println("Whiskey : Rs 5000");
                    System.out.println("Bottle : Rs 500");
                    System.out.println("Chocolate : Rs 400");
                    break;
                case 2:
                    int total = 0;

                    while(true) {
                        System.out.println(Product.product);
                        System.out.println("Enter exit to exit");
                        System.out.println("Enter product name you want to buy:");
                        input= ask.nextLine();

                        if (input.equals(Product.product.get(0))){
                            price = 100;
                            System.out.println("Rs:"+price);
                        }

                        if (input.equals(Product.product.get(1))){
                            price = 3000;
                            System.out.println("Rs:"+price);
                        }

                        if (input.equals(Product.product.get(2))){
                            price = 1000;
                            System.out.println("Rs:"+price);
                        }

                        if (input.equals(Product.product.get(3))){
                            price = 500;
                            System.out.println("Rs:"+price);
                        }

                        if (input.equals(Product.product.get(4))){
                            price = 5000;
                            System.out.println("Rs:"+price);
                        }

                        if (input.equals(Product.product.get(5))){
                            price = 500;
                            System.out.println("Rs:"+price);
                        }

                        if (input.equals(Product.product.get(6))){
                            price = 400;
                            System.out.println("Rs:"+price);
                        }

                        if (input.equals("exit")) {
                            break;
                        }

                        total += price;
                    }
                    System.out.println("Your total price: "+total);

                    break;
                case 3:
                    System.out.println("Please rate our store!");
                    rate= ask.nextInt();
                        System.out.println("Thank you visit again!!!");
                    break;
                default:
                    System.out.println("Wrong input!!");
            }
        }
    }
}