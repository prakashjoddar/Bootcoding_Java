package L2;
/* WAP to print all numbers between 1 to 100 which are divided by a
specified number and the remainder will be 3.
Test Data :
Input an integer: 25
Expected Output:
3
28
53
78 */

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        System.out.println("Input an integer: ");
        int number = new Scanner(System.in).nextInt();
        for(int i =0; i<=100; i++){
            if(i%number==3){
                System.out.println(i);
            }
        }
    }
}
