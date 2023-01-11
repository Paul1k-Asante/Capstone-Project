package MallsReceipt;

import java.util.Scanner;


public class Acmall {
    public static void main(String[] args) {
        Scanner Mall = new Scanner(System.in);
        String Phone, Product1, Product2, Product3, Product4, Product5, FirstName, LastName, EmployeeName1, EmployeeName2, EmployeeID;
        double PriceOfProduct1, PriceOfProduct2, PriceOfProduct3, PriceOfProduct4, PriceOfProduct5;
        int Amountbought1, Amountbought2, Amountbought3, Amountbought4, Amountbought5, Totalitems;
        short day, month, year;
        double total1, total2, total3, total4, total5, overalltotal, discount1, Newtotal;

        //input for Name of customer and phone
        System.out.println("Welcome to A&C Mall");
        System.out.println("Enter Customer's First Name");
        FirstName = Mall.next();
        System.out.println("Enter Customer's Last Name");
        LastName = Mall.next();
        System.out.println("Enter Customer's Phone Number");
        Phone = Mall.next();

        //input for calendar
        System.out.println("Day");
        day = Mall.nextShort();
        System.out.println("Month");
        month = Mall.nextShort();
        System.out.println("Year");
        year = Mall.nextShort();

        //input for data
        System.out.println("Enter Product Name");
        Product1 = Mall.next();
        System.out.println("Enter Price");
        PriceOfProduct1 = Mall.nextDouble();
        System.out.println("Enter Quantity Bought");
        Amountbought1 = Mall.nextInt();
        System.out.println("Enter Product Name");
        Product2 = Mall.next();
        System.out.println("Enter Price");
        PriceOfProduct2 = Mall.nextDouble();
        System.out.println("Enter Quantity Bought");
        Amountbought2 = Mall.nextInt();
        System.out.println("Enter Product Name");
        Product3 = Mall.next();
        System.out.println("Enter Price");
        PriceOfProduct3 = Mall.nextDouble();
        System.out.println("Enter Quantity Bought");
        Amountbought3 = Mall.nextInt();
        System.out.println("Enter Product Name");
        Product4 = Mall.next();
        System.out.println("Enter Price");
        PriceOfProduct4 = Mall.nextDouble();
        System.out.println("Enter Quantity Bought");
        Amountbought4 = Mall.nextInt();
        System.out.println("Enter Product Name");
        Product5 = Mall.next();
        System.out.println("Enter Price");
        PriceOfProduct5 = Mall.nextDouble();
        System.out.println("Enter Quantity Bought");
        Amountbought5 = Mall.nextInt();
        System.out.println("Enter discount value");
        discount1 = Mall.nextDouble();
        System.out.println("Employee First Name");
        EmployeeName1 = Mall.next();
        System.out.println("Employee Last Name");
        EmployeeName2 = Mall.next();
        System.out.println("Employee ID");
        EmployeeID = Mall.next();


        //calculations
        total1 = PriceOfProduct1 * Amountbought1;
        total2 = PriceOfProduct2 * Amountbought2;
        total3 = PriceOfProduct3 * Amountbought3;
        total4 = PriceOfProduct4 * Amountbought4;
        total5 = PriceOfProduct5 * Amountbought5;
        overalltotal = total1 + total2 + total3 + total4 + total5;
        Newtotal = overalltotal * (discount1 / 100);
        Totalitems = Amountbought1 + Amountbought2 + Amountbought3 + Amountbought4 + Amountbought5;

        //output
        System.out.println("\t\tWelcome to A&C Shopping Center");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Customer Name: " + FirstName + "\t" + LastName);
        System.out.println("Telephone: " + Phone);
        System.out.println("Date: " + day + "/ " + month + "/ " + year);
        System.out.println("===============================================================");
        System.out.printf("%1$-15s %2$-10s %3$-10s %4$-10s\n","Item","Price(GHS)","Qty", "Subtotal(GHS)");
        System.out.printf("%1$-15s %2$-10s %3$-10s %4$-10s\n","1."+Product1,"¢"+PriceOfProduct1,Amountbought1, "¢"+total1);
        System.out.printf("%1$-15s %2$-10s %3$-10s %4$-10s\n", "2."+Product2,"¢"+PriceOfProduct2,Amountbought2, "¢"+total2);
        System.out.printf("%1$-15s %2$-10s %3$-10s %4$-10s\n","3."+Product3,"¢"+PriceOfProduct3,Amountbought3, "¢"+total3);
        System.out.printf("%1$-15s %2$-10s %3$-10s %4$-10s\n","4."+Product4,"¢"+PriceOfProduct4,Amountbought4, "¢"+total3);
        System.out.printf("%1$-15s %2$-10s %3$-10s %4$-10s\n","5."+Product5,"¢"+PriceOfProduct5,Amountbought5, "¢"+total5);

        System.out.println("...............................................................");
        System.out.println("Total Number of Items Bought: " + Totalitems);
        System.out.println("Total(GHS)= " + overalltotal);
        System.out.println("Total(GHS)= " + overalltotal);
        System.out.println("Discount Available= " + discount1);
        System.out.println("New Total(GHS)= " + Newtotal);
        System.out.println("***************************************************************");
        System.out.println("Employee Name: " + EmployeeName1 + "\t" + EmployeeName2);
        System.out.println("Employee ID: " + EmployeeID);
        System.out.println("***************************************************************");
        if (Totalitems >= 10){
            System.out.println("You Have A Special Offer");
            System.out.println("Select An Item From Our Food Catalogue For Free");
        } else {
            System.out.println("You Have No Special Offer");
        }
        System.out.println("===============================================================");
        System.out.println("\t\t\t\t\t\tThank You");
    }
}


