import java.util.Scanner;

public class Asphalt {
   public static void main(String[] args) {

      // Below this comment: declare and instantiate a Scanner
      
      Scanner sc = new Scanner(System.in);
      
      // Below this comment: declare any variables you may need
      
      System.out.print("Enter length of road in miles    : ");
      double miles = sc.nextDouble();

      System.out.print("Enter number of lanes            : ");
      int lanes = sc.nextInt();

      System.out.print("Enter depth of asphalt in inches : ");
      int depthInches = sc.nextInt();

      double feetPerMile = 5280.0;
      double feetPerLane = 12.0;
      double poundsPerCubicFoot = 145.0;
      double poundsPerTon = 2000.0;
      int tonsPerTruck = 5;
      double costPerTon = 150.0;
      
      // Below this comment: write Java code to do the computations needed to determine the correct output
      
      double lengthFeet = miles * feetPerMile;
      double widthFeet = lanes * feetPerLane;
      double depthFeet = depthInches / 12.0;

      double volumeCubicFeet = lengthFeet * widthFeet * depthFeet;
      double pounds = volumeCubicFeet * poundsPerCubicFoot;
      double tons = pounds / poundsPerTon;
      
      int truckloads = (int) Math.ceil(tons / tonsPerTruck);
      double totalCost = (truckloads * tonsPerTruck) * costPerTon;

      // Below this comment: output the correct output
      
      System.out.println();
      System.out.printf("Truckloads of asphalt needed is  : %d%n", truckloads);
      System.out.printf("Total cost of asphalt is         : $%.2f%n", totalCost);

   }
}