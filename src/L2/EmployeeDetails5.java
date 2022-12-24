/* 5) WAP that accepts an employee's ID, total worked hours of a month and
the amount he received per hour. Print the employee's ID and salary
(with two decimal places) of a particular month.
Test Data :
Input the Employees ID(Max. 10 chars): 0342
Input the working hrs: 8
Salary amount/hr: 15000
Expected Output:
Employees ID = 0342
Salary = U$ 120000.00 */

package L2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EmployeeDetails5 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the Employees ID(Max. 10 chars): ");
        int employeeId = scanner.nextInt();

        System.out.println("Input the working hrs: ");
        int workingHours = scanner.nextInt();

        System.out.println("Salary amount/hr: ");
        float salary = scanner.nextFloat();

        System.out.println("\nEmployees ID = "+employeeId);
        System.out.println("Salary = U$ "+  df.format(workingHours*salary));
    }
}
