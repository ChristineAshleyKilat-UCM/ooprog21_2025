import java.util.Scanner;

class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many hours did you work this week? ");
        double hoursworked = input.nextDouble();

        System.out.print("What is your regular pay rate? ");
        double payrate = input.nextDouble();

        Employee employee = new Employee(1, payrate);

        double regularpay = employee.calculateRegularPay(hoursworked);
        double overtimepay = employee.calculateOvertimePay(hoursworked);

        System.out.println("Regular pay is " + regularpay);
        System.out.println("Overtime pay is " + overtimepay);

        input.close();
    }
}