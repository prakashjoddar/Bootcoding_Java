/*
3) WAP to make such a pattern like right angle triangle with a number
which will repeat a number in a row.
The pattern like :
1
22
333
4444
* */

package Pattern;

public class Pattern3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
