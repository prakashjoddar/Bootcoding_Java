/* 2) WAP to display the pattern like right angle triangle with a number.
The pattern like :
1
12
123
1234

*/

package Pattern;

public class Pattern2 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }
}
