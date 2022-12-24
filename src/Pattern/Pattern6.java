/*
6) WAP to make such a pattern like a pyramid with an asterisk.

    *
  * *
 * * *
* * * *

 */
package Pattern;

public class Pattern6 {
    public static void main(String[] args) {
        int iterationNumber = 5;
        for (int i = 0; i < iterationNumber; i++) {
            for (int j = 0; j < iterationNumber; j++) {
                if (j < iterationNumber - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();

        }
    }
}
