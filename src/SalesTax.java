import jdk.jfr.internal.tool.Main;

import java.util.Scanner;

public class SalesTax {

    public static void main(String[] args)
    {
	   Scanner in = new Scanner(System.in);
       System.out.print("The price of the purchase: $");
       double price = in.nextDouble();
       double tax = price * 0.05;
       System.out.printf("Sales tax is $%.2f/n", tax);
    }
}
