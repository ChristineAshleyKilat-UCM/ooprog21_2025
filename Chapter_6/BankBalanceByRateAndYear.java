import java.util.Scanner;

public class BankBalanceByRateAndYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        double initialBalance = scan.nextDouble();

        double[] rates = {0.02, 0.03, 0.04, 0.05};

        for (int i = 0; i < rates.length; i++) {
            double balance = initialBalance;
            System.out.println("\nWith an initial balance of $" + initialBalance 
                               + " at an interest rate of " + rates[i]);

            for (int year = 1; year <= 4; year++) {
                balance += (balance * rates[i]);
                System.out.printf("After year " + year + " balance is $" + balance + "\n");
            }
            
            System.out.println();
            
         }  
        scan.close();
    }

}