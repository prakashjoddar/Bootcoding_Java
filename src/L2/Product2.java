/* 2) Write a Java program that takes two numbers as input and display the
product of two numbers.
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125 */

package L2;
import java.util.Scanner;

public class Product2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first number: ");
        int num1 = sc.nextInt();
        System.out.println("Input second number: ");
        int num2 = sc.nextInt();

        int result = num1 * num2;

        System.out.println(num1 +" x "+ num2 +" = "+ result);
    }
}
