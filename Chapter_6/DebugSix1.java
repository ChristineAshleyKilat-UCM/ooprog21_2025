// Start with a penny
// double it every day
// how much do you have in x number of days?

import java.util.Scanner;

class DebugSix1 {
public static void main(String[] args) { //Changed (String args[]) to (String[] args)

   Scanner keyboard = new Scanner(System.in);
   int days;
   double money = 0.01;  
   int day = 1;  
   
   System.out.print("Enter number of days >> ");  // Added a missing semicolon
   days = keyboard.nextInt();
   
   while (day <= days) {  // Changed while(days < day) to (day <= days)
   System.out.println("After day " + day +  // Switched days to day so it shows the actual day number not the total days
   " you have " + money);
   money = 2 * money;  // Moved this doubling step after the print, so the amount will output at the end of each day 
   ++day;  
        }
    }
}
