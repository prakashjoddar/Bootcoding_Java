/*
8) WAP to display Pascal's triangle.
Test Data :
Input number of rows: 5
Expected Output :
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1

* */

package Pattern;
public class Pattern8 {
    public static void main(String[] args) {
        System.out.println("Input number of rows: ");
        //int number = new Scanner(System.in).nextInt();
        int number = 6;

        int[][] patternArray = new int[number + 1][number + 1];

        for (int i = 0; i <= number; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0) {
                    patternArray[i][j] = 1;
                } else {
                    if (j == i) {
                        patternArray[i][j] = 1;
                    } else if (i > 1) {
                        patternArray[i][j] = patternArray[i - 1][j - 1] + patternArray[i - 1][j];
                    }
                }
            }
        }

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number-i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print(patternArray[i][j]+" ");
            }
            System.out.println();
        }
        //System.out.println(Arrays.deepToString(patternArray));

    }
}
