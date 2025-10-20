import java.util.Scanner;

class BankBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter initial bank balance > ");
        double balance = scan.nextDouble();
        
        double interestrate = 0.03;
        int year = 0;
        int choice = 1;
        
        System.out.print("Do you want to see next year's balance? " + "\n" +"Enter 1 for yes or any other number for no >> ");
        choice = scan.nextInt();
        
        while (choice == 1) {
            year++;
            balance = balance * (1 + interestrate);
            System.out.printf("After year %d at %.2f interest rate, balance is $%.1f%n" + "\n", year, interestrate, balance);
            
            System.out.print("Do you want to see the balance at the end of another year?" + "\n" + " Enter 1 for yes or any other number for no >> ");
            choice = scan.nextInt();
        }
        
        scan.close();
    }
}
