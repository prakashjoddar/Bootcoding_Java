/* 9) WAP that reads an integer between 1 and 12 and print the month of the
year in English.
Test Data :
Input a number between 1 to 12 to get the month name: 8
Expected Output:
August */

package L2;

import java.util.Scanner;

public class FindMonth9 {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("Input a number between 1 to 12 to get the month name: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println(months[number-1]);
    }
}
