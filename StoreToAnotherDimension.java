package com.mycompany.storetoanotherdimension;

import java.util.Scanner;
import javax.sound.midi.Soundbank;

/**
 *
 * @author ADMIN
 */
public class StoreToAnotherDimension {

    public static Scanner input = new Scanner(System.in);
    public static String x;
    public static int x1, x_1 = 1;
    public static double x2 = 0, x_2;
    public static int x3, x_3;

    public static void GoodSheesh() {
        System.out.println("THE STORE TO ANOTHER DIMENSION");
        System.out.println("┈╭━━━━━━━━━━━╮┈\n" +
"┈┃╭━━━╮┊╭━━━╮┃┈\n" +
"╭┫┃┈▇┈┃┊┃┈▇┈┃┣╮\n" +
"┃┃╰━━━╯┊╰━━━╯┃┃\n" +
"╰┫╭━╮╰━━━╯╭━╮┣╯\n" +
"┈┃┃┣┳┳┳┳┳┳┳┫┃┃┈\n" +
"┈┃┃╰┻┻┻┻┻┻┻╯┃┃┈\n" +
"┈╰━━━━━━━━━━━╯┈");
        System.out.println("[STORE CLERK]: SUP DUDE!, WELCOME TO THE STORE");
        System.out.println("WE CURRENTLY HAVE PROMOS HERE");
        System.out.println("IF YOU BUY 2 SAME EXACT ITEMS, YOU'LL GET A 10% DISCOUNT");
        System.out.println("IF YOU BUY 3 SAME EXACT ITEMS, YOU'LL GET A 20% DISCOUNT");
        System.out.println("JUST CHOOSE WHATEVER YOU WANT");
        System.out.println("====================================================");
        System.out.println("1: Shabu - $5000\n" + "2: Marijuana - $2000\n" + "3: Cocaine - $3000\n" + "4: Rugby - $150\n" + "5: Vulca Seal - $50");
        System.out.println("====================================================");
    }

    public static void order() {
       x2 = 0;
          System.out.println("----------------------------------------------------");
        System.out.println("[CASHIER]: SUP BRO, WHAT DO YOU WANT? JUST CHOOSE");
        System.out.println("----------------------------------------------------");
        System.out.println("Press 1 for Shabu, Press 2 for Marijuana, Press 3 for Cocaine, Press 4 for Rugby, Press 5 for Vulca Seal");
        System.out.println("----------------------------------------------------");
        System.out.print("[CASHIER]: Do you want to buy?, Just press the numbers: ");
        x1 = input.nextInt();

        if (x1 == 1) {
              System.out.println("----------------------------------------------------");
            System.out.println("The customer choose Shabu");
              System.out.println("----------------------------------------------------");
            System.out.print("[CASHIER]: How many Shabu's do you want?: ");
            x_1 = input.nextInt();
            x2 = x2 + (x_1 * 5000);

            if (x_1 == 2) {
                  System.out.println("----------------------------------------------------");
                System.out.println("[CASHIER]: Thank you for availing on our promo, you got a 10% discount");
                x2 = x2 * .90;

            } else if (x_1 == 3) {
                  System.out.println("----------------------------------------------------");
                System.out.println("[CASHIER]: Thank you for availing on our promo, you got a 20% discount");
                x2 = x2 * .80;
            }
          
            System.out.println(" [CASHIER]: You want to buy again?");
              System.out.println("----------------------------------------------------");
            System.out.print("[CASHIER]: Press Y if YES and N if NO: ");
            x = input.next();
            if (x.equalsIgnoreCase("Y")) {
                order();

            } else {
                  System.out.println("----------------------------------------------------");
                System.out.println("[SYSTEM]: Enter cash payment");
                x_2 = input.nextDouble();
                if (x_2 <= x2) {
                      System.out.println("----------------------------------------------------");
                    System.out.println("[SYSTEM]: Insufficient cash");
                      System.out.println("----------------------------------------------------");
                    System.out.println(" (　-_･) ︻デ═一 ▸");
                    System.out.println("The store owner kicked the customer out of the store");
                } else {
                      System.out.println("----------------------------------------------------");
                    System.out.println("[SYSTEM]: Total Price" + x2);
                    x2 = x_2 - x2;
                      System.out.println("----------------------------------------------------");
                    System.out.println("[SYSTEM]: Total Change" + x2);
                    x2 = x_2 - x2;
                      System.out.println("----------------------------------------------------");
                    System.out.println("[CASHIER]: Next customer please\n" + "Press 1 to proceed otherwise press 2");
                    x3 = input.nextInt();
                }
                if (x3 == 1) {
                    order();

                } else if (x3 == 2) {
                      System.out.println("----------------------------------------------------");
                    System.out.println("[STORE CLERK]: Great, now we can relaw and chill");
                }
            }

        } else if (x1 == 2) {
              System.out.println("----------------------------------------------------");
            System.out.println("The customer choose Marijuana");
              System.out.println("----------------------------------------------------");
            System.out.print("[CASHIER]: How many Marijuana's do you want?: ");
            x_1 = input.nextInt();
            x2 = x2 + (x_1 * 2000);

            if (x_1 == 2) {
                  System.out.println("----------------------------------------------------");
                System.out.println("[CASHIER]: Thank you for availing on our promo, you got a 10% discount");
                x2 = x2 * .90;
            } else if (x_1 == 3) {
                  System.out.println("----------------------------------------------------");
                System.out.println("[CASHIER]: Thank you for availing on our promo, you got a 20% discount");
                x2 = x2 * .80;
            }
            System.out.println("[CASHIER]: You want to buy again?");
              System.out.println("----------------------------------------------------");
            System.out.print("[CASHIER]: Press Y if YES and N if NO: ");
            x = input.next();
            if (x.equalsIgnoreCase("Y")) {
                order();

            } else {
                  System.out.println("----------------------------------------------------");
                System.out.println("[SYSTEM]: Enter cash payment");
                x_2 = input.nextDouble();
                if (x_2 <= x2) {
                    
                      System.out.println("----------------------------------------------------");
                    System.out.println("[SYSTEM]: Insufficient cash");
                    System.out.println("----------------------------------------------------");
                    System.out.println(" (　-_･) ︻デ═一 ▸");
                    System.out.println("The store owner kicked the customer out of the store");
                } else {
                      System.out.println("----------------------------------------------------");
                    System.out.println("[SYSTEM]: Total Price" + x2);
                    x2 = x_2 - x2;
                      System.out.println("----------------------------------------------------");
                    System.out.println("[SYSTEM]: Total Change" + x2);
                    x2 = x_2 - x2;
                      System.out.println("----------------------------------------------------");
                    System.out.println("[CASHIER]: Next customer please\n" + "Press 1 to proceed otherwise press 2");
                    x3 = input.nextInt();
                }
                if (x3 == 1) {
                    order();

                } else if (x3 == 2) {
                      System.out.println("----------------------------------------------------");
                    System.out.println("[STORE CLERK]: Great, now we can relaw and chill");
                }

            }
        } else if (x1 == 3) {
              System.out.println("----------------------------------------------------");
            System.out.println("The customer choose Cocaine");
              System.out.println("----------------------------------------------------");
            System.out.print("[CASHIER]: How many Cocane's do you want?: ");
            x_1 = input.nextInt();
            x2 = x2 + (x_1 * 3000);

            if (x_1 == 2) {
                  System.out.println("----------------------------------------------------");
                System.out.println("[CASHIER]: Thank you for availing on our promo, you got a 10% discount");
                x2 = x2 * .90;
            } else if (x_1 == 3) {
                  System.out.println("----------------------------------------------------");
                System.out.println("[CASHIER]: Thank you for availing on our promo, you got a 20% discount");
                x2 = x2 * .80;
            }
             
             System.out.println("[CASHIER]: You want to buy again?");
               System.out.println("----------------------------------------------------");
            System.out.print("[CASHIER]: Press Y if YES and N if NO: ");
            x = input.next();
            if (x.equalsIgnoreCase("Y")) {
                order();

            } else {
                  System.out.println("----------------------------------------------------");
                System.out.println("[SYSTEM]: Enter cash payment");
                x_2 = input.nextDouble();
                if (x_2 <= x2) {
                    
                      System.out.println("----------------------------------------------------");
                    System.out.println("[SYSTEM]: Insufficient cash");
                      System.out.println("----------------------------------------------------");
                      System.out.println(" (　-_･) ︻デ═一 ▸");
                    System.out.println("The store owner kicked the customer out of the store");
                } else {
                      System.out.println("----------------------------------------------------");
                    System.out.println("[SYSTEM]: Total Price" + x2);
                    x2 = x_2 - x2;
                      System.out.println("----------------------------------------------------");
                    System.out.println("[SYSTEM]: Total Change" + x2);
                    x2 = x_2 - x2;
                      System.out.println("----------------------------------------------------");
                    System.out.println("[CASHIER]: Next customer please\n" + "Press 1 to proceed otherwise press 2");
                    x3 = input.nextInt();
                }
                if (x3 == 1) {
                    order();

                } else if (x3 == 2) {
                      System.out.println("----------------------------------------------------");
                    System.out.println("[STORE CLERK]: Great, now we can relaw and chill");
                }
            }


        } else if (x1 == 4) {
              System.out.println("----------------------------------------------------");
            System.out.println("[CASHIER]: The customer choose Rugby");
              System.out.println("----------------------------------------------------");
            System.out.print("[CASHIER]: How many Rugbies do you want?: ");
            x_1 = input.nextInt();
            x2 = x2 + (x_1 * 150);

            if (x_1 == 2) {
                  System.out.println("----------------------------------------------------");
                System.out.println("[CASHIER]: Thank you for availing on our promo, you got a 10% discount");
                x2 = x2 * .90;
            } else if (x_1 == 3) {
                  System.out.println("----------------------------------------------------");
                System.out.println("[CASHIER]: Thank you for availing on our promo, you got a 20% discount");
                x2 = x2 * .80;
            }
     
            System.out.println("[CASHIER]: You want to buy again?");
              System.out.println("----------------------------------------------------");
            System.out.print("[CASHIER]: Press Y if YES and N if NO: ");
            x = input.next();
            if (x.equalsIgnoreCase("Y")) {
                order();

            } else {
                  System.out.println("----------------------------------------------------");
                System.out.println("[SYSTEM]: Enter cash payment");
                x_2 = input.nextDouble();
                if (x_2 <= x2) {
                      System.out.println("----------------------------------------------------");
                    System.out.println("[SYSTEM]: Insufficient cash");
                      System.out.println("----------------------------------------------------");
                      System.out.println(" (　-_･) ︻デ═一 ▸");
                     System.out.println("The store owner kicked the customer out of the store");
                } else {
                      System.out.println("----------------------------------------------------");
                    System.out.println("[SYSTEM]: Total Price" + x2);
                    x2 = x_2 - x2;
                      System.out.println("----------------------------------------------------");
                    System.out.println("[SYSTEM]: Total Change" + x2);
                    x2 = x_2 - x2;
                      System.out.println("----------------------------------------------------");
                    System.out.println("[CASHIER]: Next customer please\n" + "Press 1 to proceed otherwise press 2");
                    x3 = input.nextInt();
                }
                if (x3 == 1) {
                    order();

                } else if (x3 == 2) {
                      System.out.println("----------------------------------------------------");
                   System.out.println("[STORE CLERK]: Great, now we can relaw and chill");
                }

            }
        } else if (x1 == 5) {
              System.out.println("----------------------------------------------------");
            System.out.println("The customer choose Vulca Seal");
              System.out.println("----------------------------------------------------");
            System.out.print("[CASHIER]: How many Vulca Seal's do you want?: ");
            x_1 = input.nextInt();
            x2 = x2 + (x_1 * 50);

            if (x_1 == 2) {
                  System.out.println("----------------------------------------------------");
                System.out.println("[CASHIER]: Thank you for availing on our promo, you got a 10% discount");
                x2 = x2 * .90;
            } else if (x_1 == 3) {
                  System.out.println("----------------------------------------------------");
                System.out.println("[CASHIER]: Thank you for availing on our promo, you got a 20% discount");
                x2 = x2 * .80;
            }
            
            System.out.println("[CASHIER]: You want to buy again?");
              System.out.println("----------------------------------------------------");
            System.out.print("[CASHIER]: Press Y if YES and N if NO: ");
            x = input.next();
            if (x.equalsIgnoreCase("Y")) {
                order();

            } else {
  System.out.println("----------------------------------------------------");
                System.out.println("[SYSTEM]: Enter cash payment");
                x_2 = input.nextDouble();
                if (x_2 <= x2) {
                      System.out.println("----------------------------------------------------");
                    System.out.println("[SYSTEM]: Insufficient cash");
                      System.out.println("----------------------------------------------------");
                      System.out.println(" (　-_･) ︻デ═一 ▸");
                   System.out.println("The store owner kicked the customer out of the store");
                } else {
                      System.out.println("----------------------------------------------------");
                    System.out.println("[SYSTEM]: Total Price" + x2);
                    x2 = x_2 - x2;
                      System.out.println("----------------------------------------------------");
                    System.out.println("[SYSTEM]: Total Change" + x2);
                    x2 = x_2 - x2;
                      System.out.println("----------------------------------------------------");
                    System.out.println("[CASHIER]: Next customer please\n" + "Press 1 to proceed otherwise press 2");
                    x3 = input.nextInt();
                }
                if (x3 == 1) {
                    order();

                } else if (x3 == 2) {
                      System.out.println("----------------------------------------------------");
                    System.out.println("[STORE CLERK]: Great, now we can relaw and chill");
                }
            }

        }
    }

    public static void main(String[] args) {
        GoodSheesh();
        order();
    }
}
