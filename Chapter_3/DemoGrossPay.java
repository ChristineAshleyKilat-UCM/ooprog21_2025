class DemoGrossPay {
   public static final double hourlyrate = 22.75;
   public static void main(String[] args) {
   
   calculateGross(10.0);
   calculateGross(25.0);
   calculateGross(37.5);
   }
   
   public static void calculateGross(double hours_worked) {
   
   double Grosspay = hours_worked * hourlyrate;
   System.out.println(hours_worked + " hours at $" + hourlyrate + " per hour is $" + Grosspay);
   
   }
}
   