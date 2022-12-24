package L2;

/* WAP to find the sum of the series 1 +11 + 111 + 1111 + .. n terms.
Test Data :
Input the number of terms : 5
Expected Output :
1 + 11 + 111 + 1111 + 11111
The Sum is : 12345 */

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        System.out.println("Input the number of terms : ");
        int number = new Scanner(System.in).nextInt();
        long result = 0;
        String stringResult = "";

        for (int i = 1; i <= number; i++) {

            if (i == 1) {
                stringResult += "1";
                result += 1;
            } else {
                long tempResult = 0;
                for (int j = 0; j < i; j++) {
                    tempResult += Math.pow(10, j);
                }
                result += tempResult;
                stringResult += " + " + tempResult;
            }
        }
        System.out.println(stringResult);
        System.out.println("The Sum is: "+ result);

    }
}
