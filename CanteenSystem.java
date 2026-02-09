import java.util.Scanner;

public class CanteenSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        Cart cart = new Cart();
        Billing bill = new Billing();

        boolean run = true;

        Style.title("WELCOME TO LADLEEEE... CANTEEN");
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        while (run) {

            Style.title("MAIN MENU");
            System.out.println("1) Start New Order");
            System.out.println("2) Generate Bill");
            System.out.println("3) Exit");
            Style.line();
            System.out.print("Enter choice: ");
            int c = sc.nextInt();

            if (c == 1) {
                boolean order = true;
                while (order) {

                    Style.title("SELECT CATEGORY");
                    System.out.println("1) Starters");
                    System.out.println("2) Main Course");
                    System.out.println("3) Snacks");
                    System.out.println("4) Desserts");
                    System.out.println("5) Back");
                    Style.line();
                    System.out.print("Choice: ");
                    int cat = sc.nextInt();

                    if (cat == 5) break;

                    Style.title("CHOOSE AN ITEM");
                    menu.showCategory(cat);
                    Style.line();
                    System.out.print("Enter item number: ");
                    int item = sc.nextInt() - 1;

                    System.out.print("Enter quantity: ");
                    int q = sc.nextInt();

                    cart.add(cat, item, q);
                    System.out.println("✔ Item Added Successfully!");
                }
            }

            else if (c == 2) {

                double tot = 0;
                tot += bill.total(menu.startersPrice, cart.startersQty);
                tot += bill.total(menu.mainPrice, cart.mainQty);
                tot += bill.total(menu.snacksPrice, cart.snacksQty);
                tot += bill.total(menu.dessertsPrice, cart.dessertsQty);

                double gst = bill.gst(tot);
                double finalAmt = bill.cashback(gst);
                int pts = bill.points(finalAmt);

                Style.title("FINAL BILL");
                System.out.println("Customer: " + name);
                Style.line();

                System.out.printf("%-30s %10s\n", "ITEM", "TOTAL (₹)");
                Style.line();

                for (int i=0; i<25; i++)
                    if (cart.startersQty[i] > 0)
                        System.out.printf("%-30s %10.2f\n",
                                menu.starters[i], menu.startersPrice[i] * cart.startersQty[i]);

                for (int i=0; i<25; i++)
                    if (cart.mainQty[i] > 0)
                        System.out.printf("%-30s %10.2f\n",
                                menu.mainCourse[i], menu.mainPrice[i] * cart.mainQty[i]);

                for (int i=0; i<25; i++)
                    if (cart.snacksQty[i] > 0)
                        System.out.printf("%-30s %10.2f\n",
                                menu.snacks[i], menu.snacksPrice[i] * cart.snacksQty[i]);

                for (int i=0; i<25; i++)
                    if (cart.dessertsQty[i] > 0)
                        System.out.printf("%-30s %10.2f\n",
                                menu.desserts[i], menu.dessertsPrice[i] * cart.dessertsQty[i]);

                Style.line();

                System.out.printf("%-30s %10.2f\n", "Subtotal:", tot);
                System.out.printf("%-30s %10.2f\n", "GST (18%):", gst - tot);
                System.out.printf("%-30s %10.2f\n", "Total With GST:", gst);

                if (gst > 500)
                    System.out.printf("%-30s %10.2f\n", "Cashback (5%):", gst * 0.05);

                System.out.printf("%-30s %10.2f\n", "FINAL PAYABLE:", finalAmt);
                System.out.printf("%-30s %10d\n", "Loyalty Points Earned:", pts);

                Style.line();
                Style.center("Thank You! Visit Again");
                Style.line();
            }

            else run = false;
        }
    }
}
