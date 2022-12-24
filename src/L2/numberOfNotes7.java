/* 7) WAP to read an amount (integer value) and break the amount into the
smallest possible number of bank notes.
Test Data :
Input the amount: 375
Expected Output:
There are:
3 Note(s) of 100.00
1 Note(s) of 50.00
1 Note(s) of 20.00
0 Note(s) of 10.00
1 Note(s) of 5.00
0 Note(s) of 2.00
0 Note(s) of 1.00
 */

package L2;

import java.util.Scanner;

public class numberOfNotes7 {
    public static void main(String[] args) {
        System.out.println("Input the amount: ");
        int amount = new Scanner(System.in).nextInt();

        int[] noteValue = {2000, 500, 100, 50, 20, 10, 5, 2, 1};
        int index = 0;
        while (index < noteValue.length) {
            int noOfNote = amount / noteValue[index];
            amount %= noteValue[index];
            System.out.println(noOfNote + "  Notes of " + noteValue[index]);

            index++;
        }
    }
}
