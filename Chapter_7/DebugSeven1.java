// Makes String comparisons
import java.util.*;
public class DebugSeven1
{
public static void main(String[] args)
{
Scanner kb = new Scanner(System.in);
String name1, name2, name3;
System.out.println("Enter three names.");
System.out.println("They can be the same or different.");
System.out.print("First name >> ");
name1 = kb.nextLine(); // nextLine is missing a ()
System.out.print("Second name >> ");
name2 = kb.nextLine(); // nextLine is missing a ()
System.out.print("Third name >> ");
name3 = kb.nextLine(); // nextLine is missing a ()
compareNames(name1, name2);
compareNames(name1, name3);
compareNames(name2, name3);
}
public static void compareNames(String n1, String n2) //Changed method name from comparNames to compareNames and added the missing type for n2
{
System.out.print(n1 + " and " + n2);
if(n1.equals(n2)) { //Added missing closing parenthesis in equals() and added a opening curly bracket
System.out.println(" are the same");
} //Added a closing curly bracket
else { //Added a opening curly bracket
System.out.println(" are different");
}//Added a closing curly bracket
}
}