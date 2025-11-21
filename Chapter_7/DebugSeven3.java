// Program accepts a String and displays some facts
import java.util.*;

class DebugSeven3
{
public static void main(String[] args)
{
Scanner kb = new Scanner(System.in);
String quote, charString;
char searchChar;
System.out.print("Enter a famous quote >> ");
quote = kb.nextLine(); //Added the missing kb
System.out.print("Enter a character to search for >> ");
charString = kb.next(); //Removed the Int since it is a string
searchChar = charString.charAt(0);
System.out.println("index of('" + searchChar + "') is: " +
quote.indexOf(searchChar)); //Added the missing closing bracket
System.out.println("indexOf('a') is: " + quote.indexOf('a')); //Added the missing opening bracket
System.out.println("indexOf('x') is: " + quote.indexOf('x'));
System.out.println("charAt(5) is: " + quote.charAt(5));
System.out.println("replace('e', '*') is: " +
quote.replace('e', '*')); //Changed repplace to replace
}
}
