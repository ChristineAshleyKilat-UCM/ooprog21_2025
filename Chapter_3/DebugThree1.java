// This class calculates a waitperson's tip
// as 15% of the bill

import java.util.Scanner;

class DebugThree1 { //removed the public access specifier so it will run on older version of java
   public static void main(String args[]) {
   double check1;
   double check2;
   
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter the amount of your check >> ");
   check1 = input.nextDouble(); //change the nextInt() to input.nextDouble()
   
   System.out.print("Enter the amount of your friend's check >> ");
   check2 = input.nextDouble(); //change the inputnextInt() to input.nextDouble()

   calcTip(check1);
   calcTip(check2);
}
public static void calcTip(double bill) { //added double bill for parameter
final double RATE = 0.15; //fixed the typo doubel to double
double tip;
tip = bill * RATE; //fixed the formula tip = bill / RATE to tip = bill * RATE
System.out.println("The tip should be at least $" + tip);
}
}
