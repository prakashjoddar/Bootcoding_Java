/* 3) Write a Java program to print the sum (addition), multiply, subtract,
divide and remainder of two numbers.
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
*/

package L2;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Input second number: ");
        int secondNumber = sc.nextInt();

        System.out.printf("\n%d + %d = %d", firstNumber, secondNumber, firstNumber+secondNumber );
        System.out.printf("\n%d - %d = %d", firstNumber, secondNumber, firstNumber-secondNumber );
        System.out.printf("\n%d * %d = %d", firstNumber, secondNumber, firstNumber*secondNumber );
        System.out.printf("\n%d / %d = %d", firstNumber, secondNumber, firstNumber/secondNumber );
        System.out.printf("\n%d mod %d = %d", firstNumber, secondNumber, firstNumber%secondNumber );
    }
}
