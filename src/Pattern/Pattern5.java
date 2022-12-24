/*
5) WAP to make such a pattern like a pyramid with numbers increased by

    1
   2 3
  4 5 6
7 8 9 10
* */

package Pattern;

public class Pattern5 {
    public static void main(String[] args) {
        int counter = 1;
        int iterationNumber = 5;

        for (int i = 0; i < iterationNumber; i++) {
            for (int j = 0; j < iterationNumber; j++) {

                if (j < iterationNumber-i) {
                    System.out.print(" ");
                } else {
                    System.out.print(counter + " ");
                    counter++;
                }

            }
            System.out.println();
        }
    }
}
