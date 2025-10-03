// DebugFive2.java
// Decides if two numbers are evenly divisible
import java.util.Scanner;
class DebugFive2 {
public static void main(String[] args) { // String[] args for clarity and consistency in array notation

int num;
int num2;
Scanner input = new Scanner(System.in);
System.out.print("Enter a number ");
num = input.nextInt();// added () to the input.nextInt
System.out.print("Enter another number ");
num2 = input.nextInt();// added () to the input.nextInt

if((num % num2 == 0) || (num2 % num) == 0) // corrected the condition 
{
System.out.println("One of these numbers is");
System.out.println(" evenly divisible into the other");
}
else
{ System.out.println("Neither of these numbers is");
System.out.println(" evenly divisible into the other");
}
}
}

