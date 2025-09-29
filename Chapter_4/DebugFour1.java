// This class uses a DebugCircle class
// to instantiate a circle object
import java.util.Scanner;

class DebugFour1
{
    public static void main(String [] args)
//Changed (String args[]) to (String [] args)
    {
        Scanner input = new Scanner(System.in);
        int radius;
        // Circle c = new Circle(); 
       // Circle is not defined, should use DebugCircle 
        System.out.print("Enter a radius for a circle >> ");
        radius = input.nextInt();
        
        // c = new DebugCircle(c); 
       //Wrong constructor, should pass radius not object
        DebugCircle c = new DebugCircle(radius); // Correct instantiation with radius

        System.out.println("The radius is " + c.getRadius());
        System.out.println("The diameter is " + c.getDiameter());
        System.out.println("The area is " + c.getArea());
    }
}