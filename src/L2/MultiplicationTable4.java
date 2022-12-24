/* 4) Write a Java program that takes a number as input and prints its
multiplication table upto 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */

package L2;

import java.util.Scanner;

public class MultiplicationTable4 {
    public static void main(String[] args) {
        System.out.println("Input a number: ");
        int num = new Scanner(System.in).nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(num +" x "+ i +" = "+ num*i);
        }
    }
}
