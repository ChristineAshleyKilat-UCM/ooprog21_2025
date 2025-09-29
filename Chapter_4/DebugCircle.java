class DebugCircle
{
    private int radius;
    private int diameter;
    private final double PI = 3.14159; 
    private double area;

    public DebugCircle(int r)
    {
        radius = r;
        diameter = 2 * r;
        area = PI * r * r;
    }

 
    public int getRadius() // Removed semicolon after method header
    {
        return radius;  // Fixed the typo radiuss to radius
    }

    public int getDiameter() { // Changed the return type void to int since we will return the value
        return diameter;
    }

    public double getArea()
    {
        return area;
    }
}