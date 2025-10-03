// DebugFive4.java
// Outputs highest of four numbers
import java.util.Scanner; // import only Scanner to make the program lighter and more readable

class DebugFive4 {
public static void main (String[] args) { // String[] args for clarity and consistency in array notation


int one, two, three, four;
int highest;
Scanner input = new Scanner(System.in);
System.out.print("Enter an integer >> ");
one = input.nextInt();
System.out.print("Enter an integer >> ");
two = input.nextInt(); // assigned the correct variable
System.out.print("Enter an integer >> ");
three = input.nextInt();  // assigned the correct variable
System.out.print("Enter an integer >> ");
four = input.nextInt();  // assigned the correct variable

// corrected if-else logic to properly find the largest number
// each number is now compared against all others using '&&'
// added missing opening and closing braces for each if/else block
if(one > two && one > three && one > four) {
highest = one;
}
else if(two > one && two > three && two > four){
highest = two;
}
else if(three > one && three > two && three > four){
highest = three;
}
else {
highest = four;
}
// just moved after fixing logic
// ensures highest number is printed correctly
System.out.println("The highest number is " + highest);
}
}

