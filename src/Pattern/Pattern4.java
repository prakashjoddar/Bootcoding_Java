/*
4) WAP to make such a pattern like right angle triangle with number
increased by 1.
The pattern like :
1
2 3
4 5 6
7 8 9 10
* */

package Pattern;

public class Pattern4 {
    public static void main(String[] args) {
        int counter=1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
}
