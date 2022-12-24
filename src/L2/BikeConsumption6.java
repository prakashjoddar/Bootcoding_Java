/* 6) WAP to calculate a bike’s average consumption from the given total
distance (integer value) travelled (in km) and spent fuel (in litres, float
number – 2 decimal point).
Test Data :
Input total distance in km: 350
Input total fuel spent in liters: 5
Expected Output:
Average consumption (km/lt) 70.000 */

package L2;

import java.util.Scanner;

class BikeConsumption6 {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Input total distance in km: ");
          int totalDistance = scanner.nextInt();

          System.out.println("Input total fuel spent in liters: ");
          float spentFuel = Float.parseFloat(String.format("%.02f", scanner.nextFloat()));

          System.out.println("\nAverage consumption (km/lt) "+ Float.parseFloat(String.format("%.03f",totalDistance/spentFuel)));
      }
}