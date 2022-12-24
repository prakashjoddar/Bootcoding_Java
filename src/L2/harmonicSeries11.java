package L2;

import java.util.Scanner;

/*
WAP to display the n terms of harmonic series and their sum.
1 + 1/2 + 1/3 + 1/4 + 1/5 ... 1/n terms
Test Data :
Input the number of terms : 5
Expected Output :
1/1 + 1/2 + 1/3 + 1/4 + 1/5 +
Sum of Series upto 5 terms : 2.283334
*/
public class harmonicSeries11 {
    public static void main(String[] args) {
        System.out.println("Input the number of terms :");
        int number = new Scanner(System.in).nextInt();
        float result = 0;
        String resultString = "";
        for (int i = 1; i <= number; i++) {
            if (i == 1) {
                resultString = "1/1";
                result = 1 / 1;
            } else {
                resultString += " + " + "1/" + i;
                result += 1 / (float)i;
//                System.out.println(result);
            }
        }
        System.out.println(resultString);
        System.out.printf("Sum of Series upto %d terms : %f", number, result);
    }
}
