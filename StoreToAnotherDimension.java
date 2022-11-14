ackage StoreToAnotherDimension;
import java.util.Scanner;

public class StoreToAnotherDimension {
        public static Scanner input = new Scanner(System.in);
        public static String again;
        public static int discount = 1;
        public static int choose, quantity = 1;
        public static double total = 0, pay;

        public static void GOODSHEESH() {

            System.out.println("=========================================");
            System.out.println("1. SHABU       $. 5000");
            System.out.println("2. MARIJUANA        $. 2000");
            System.out.println("3. COCAINE      $. 3000");
            System.out.println("4. RUGBY           $. 50");
            System.out.println("5. VULCA SEAL   $. 150");
            System.out.println("=========================================");
            System.out.println("");
            System.out.println("PROMO");
            System.out.println("Total order of $ 10000 or more, get 1 set of paraphernalia toolss");
            System.out.println("Total order of $ 20000 or more, get 1 set of paraphernalia and 1 box of Flakka Drugs");
            System.out.println(" NOTE: You can only get Flakka Drugs when you avail on our promo");
            System.out.println(" You can avail both promos at the same time.");
            System.out.println("");
            System.out.println("DISCOUNTS");
            System.out.println("D1 - Membership discount ( 10% off )");
            System.out.println("D2 - First purchase discount ( 5% off )");

        }

        public static void list1() {
            switch (choose) {
                case 1 ->
                    System.out.println(quantity + "SHABU");
                case 2 ->
                    System.out.println(quantity + "MARIJUANA");
                case 3 ->
                    System.out.println(quantity + "COCAINE");
                case 4 ->
                    System.out.println(quantity + "RUGBY");
                case 5 ->
                    System.out.println(quantity + "VULCA");
                default -> {
                }
            }
        }

        public static void list2() {
            switch (choose) {
                case 1 ->
                    System.out.println(quantity + "SHABU");
                case 2 ->
                    System.out.println(quantity + "MARIJUANA");
                case 3 ->
                    System.out.println(quantity + "COCAINE");
                case 4 ->
                    System.out.println(quantity + "RUGBY");
                case 5 ->
                    System.out.println(quantity + "VULCA");
                default -> {
                }
            }
        }

        public static void list3() {
            switch (choose) {
                case 1 ->
                    System.out.println(quantity + "SHABU");
                case 2 ->
                    System.out.println(quantity + "MARIJUANA");
                case 3 ->
                    System.out.println(quantity + "COCAINE");
                case 4 ->
                    System.out.println(quantity + "RUGBY");
                case 5 ->
                    System.out.println(quantity + "VULCA");
                default -> {
                }
            }
        }

        public static void list4() {
            switch (choose) {
                case 1 ->
                    System.out.println(quantity + "SHABU");
                case 2 ->
                    System.out.println(quantity + "MARIJUANA");
                case 3 ->
                    System.out.println(quantity + "COCAINE");
                case 4 ->
                    System.out.println(quantity + "RUGBY");
                case 5 ->
                    System.out.println(quantity + "VULCA");
                default -> {
                }
            }
        }

        public static void list5() {
            switch (choose) {
                case 1 ->
                    System.out.println(quantity + "SHABU");
                case 2 ->
                    System.out.println(quantity + "MARIJUANA");
                case 3 ->
                    System.out.println(quantity + "COCAINE");
                case 4 ->
                    System.out.println(quantity + "RUGBY");
                case 5 ->
                    System.out.println(quantity + "VULCA");
                default -> {
                }
            }
        }

        public static void order() {
            System.out.println("");
            System.out.println("Enter 6: CANCEL");
            System.out.println("WHAT IS YOUR ORDER?: ");
            choose = input.nextInt();
            System.out.println("");

            switch (choose) {

                case 1:
                    System.out.println("You chose SHABU");
                    System.out.println("HOW MANY?: ");
                    quantity = input.nextInt();
                    total = total + (quantity * 5000);
                    break;

                case 2:
                    System.out.println("You chose Beluga MARIJUANA");
                    System.out.println("HOW MANY?: ");
                    quantity = input.nextInt();
                    total = total + (quantity * 2000);
                    break;

                case 3:
                    System.out.println("You chose Fourchu COCAINE");
                    System.out.println("HOW MANY?: ");
                    quantity = input.nextInt();
                    total = total + (quantity * 3000);
                    break;

                case 4:
                    System.out.println("You chose RUGBY");
                    System.out.println("HOW MANY?: ");
                    quantity = input.nextInt();
                    total = total + (quantity * 50);
                    break;

                case 5:
                    System.out.println("You chose VULCA SEAL");
                    System.out.println("HOW MANY?: ");
                    quantity = input.nextInt();
                    total = total + (quantity * 150);
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("INVALID PARAMETER");
                    order();
                    break;
            }

            if (total >= 10000) {
                System.out.println("You have 1 set of paraphernalia tools");
            }
            if (total >= 20000) {
                System.out.println("You have 1 set of paraphernalia and 1 box of Flakka Drugs(exclusive)!");
            }

            System.out.println("");
            System.out.println("DO YOU WANNA BUY MORE?");
            System.out.print("Enter [1] if Yes and [2] if No: ");
            again = input.next();
            if (again.equalsIgnoreCase("1")) {
                order();
            } else {
                System.out.println("Discounts Available");
                System.out.println(" Discount 1 - Membership discount ( 10% off )");
                System.out.println(" Discount 2 - First Purchase discount ( 5% off )");
                System.out.println(" Note: Discounts cannot be stacked");
                System.out.println("");
                System.out.println("Press 3 if none");
                System.out.print("Enter discount number: ");
                discount = input.nextInt();
                if (discount == 1) {
                    total = total * 0.90;
                }
                if (discount == 2) {
                    total = total * 0.95;
                }
                if (discount == 3) {
                    System.out.println("No discount");
                    total = total - 0;
                }
                do {
                    System.out.println("");
                    System.out.println("TOTAL PRICE IS $ " + total + "0");
                    System.out.print("Enter Cash: ");
                    pay = input.nextDouble();

                    if (pay < total) {
                        System.out.println("INSUFFICIENT CASH, PLEASE ADD");
                        System.out.print("Enter Cash: ");
                        pay = input.nextDouble();

                    }

                } while (pay < total);
                if (pay >= total) {
                    total = pay - total;
                    System.out.println("TOTAL CHANGE IS $" + total + "0");
                }
                System.out.println("DO YOU WANNA BUY AGAIN?");
                System.out.print("Enter [1] if Yes and [2] if No: ");
                choose = input.nextInt();
                if (choose == 1) {
                  System.out.println("=========================================");
            System.out.println("1. SHABU       $. 5000");
            System.out.println("2. MARIJUANA        $. 2000");
            System.out.println("3. COCAINE      $. 3000");
            System.out.println("4. RUGBY           $. 50");
            System.out.println("5. VULCA SEAL   $. 150");
            System.out.println("=========================================");
            System.out.println("");
            System.out.println("PROMOS");
            System.out.println("Total order of $ 10000 or more, get 1 set of paraphernalia toolss");
            System.out.println("Total order of $ 20000 or more, get 1 set of paraphernalia and 1 box of Flakka Drugs");
            System.out.println(" NOTE: You can only get Flakka Drugs when you avail on our promo");
            System.out.println(" You can avail both promos at the same time.");
            System.out.println("");
            System.out.println("DISCOUNTS");
            System.out.println("D1 - Membership discount ( 10% off )");
            System.out.println("D2 - First purchase discount ( 5% off )");
                    total = total - total;
                    order();
                } else {
                    System.exit(0);
                }
            }
        }

        public static void main(String[] args) {
            GOODSHEESH();
            order();
        }

    }
