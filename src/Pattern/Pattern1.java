/* 1) WAP to display the pattern like right angle triangle using an asterisk.

The pattern like :
*
**
***
****

*/
package Pattern;

public class Pattern1 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}