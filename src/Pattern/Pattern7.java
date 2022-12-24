/*
7) WAP to display the pattern like a diamond.

    *
   ***
  *****
 *******
*********
 *******
 *****
  ***
   *

* */

package Pattern;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        int iterationNumber = 5;
        for (int i = 0; i < iterationNumber; i++) { // no of lines
            for (int j = 0; j < iterationNumber+(i-1); j++) { // no of elements
                if (j < iterationNumber - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

        for (int i = 0; i < iterationNumber-1 ; i++) {

            for (int j = 0; j<iterationNumber-i; j++) {

                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}