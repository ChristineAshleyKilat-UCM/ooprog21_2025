class DemoGrossPay {
   public static final double hourlyrate = 22.75;
   public static void main(String[] args) {
   double hours_worked = 25;
   double hours = 37.5;
   calculateGross(10);
   calculateGross(hours_worked);
   calculateGross(hours);
   }
   
   public static void calculateGross(double hours_worked) {
   
   double Grosspay = hours_worked * hourlyrate;
   System.out.println(hours_worked + " hours at $" + hourlyrate + " per hour is $" + Grosspay);
   
   }
}
   