
// Application lists valid shipping codes
// A, C, T, or H
// then prompts user for a code
// Application accepts a shipping code
// and determines if it is valid
import java.util.*;

class DebugEight1
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
char userCode;
String entry;
boolean found = false; //Changed to false
char[] okayCodes = {'A','C','T','H'};

System.out.println("Enter shipping code for this delivery.");
System.out.print("Valid codes are: ");

for(int x = 0; x < okayCodes.length; ++x) { // Changed the loop using okayCodes.length.
System.out.print(okayCodes[x]);
if(x  < (okayCodes.length - 1)) { //Comma condition corrected
System.out.print(", "); 
   }
}

System.out.print("\n\n>> ");
entry = input.nextLine();

userCode = entry.charAt(0); //Corrected the index to 0.

for(int i = 0; i < okayCodes.length; ++i) {
if(userCode == okayCodes[i]) { //Corrected the assignment
found = true;
break; //To stop the loop once found 
   }
}

if(found) { //Changed !found to found
System.out.println("Good code");
}
else{
System.out.println("Sorry code not found");
}
}
}