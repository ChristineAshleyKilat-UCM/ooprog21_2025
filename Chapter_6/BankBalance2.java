import java.util.Scanner;

class BankBalance2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double balance = 103.0;
        double rate = 0.03;
        int year = 1;
        int choice;
        int count = 0;

        while (true) {
            System.out.println("\n" + "Do you want to see the balance at the end of another year?");
            System.out.println("Enter 1 for yes");
            if (count == 0) {
                System.out.print(   "or any other number for no >> ");
            } else if (count == 1) {
                System.out.print(   "or any other number for no >> ");
            } else {
                System.out.print(   "or any other number for no >> ");
            }
            choice = scan.nextInt();
            if (choice != 1) break;
            year++;
            balance *= (1 + rate);
            String balancestr;
            if (year == 2) {
                balancestr = String.format("%.2f", balance);
                System.out.println("After year " + year + " at 0.03 interest rate, balance $" + balancestr );
            } else {
                balancestr = String.format("%.4f", balance);
                System.out.println("\n" + "After year " + year + " at 0.03 interest rate, balance is $" + balancestr);
            }
            count++;
        }

        scan.close();
    }
}
