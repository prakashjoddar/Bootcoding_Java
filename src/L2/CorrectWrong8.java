/* 8) WAP that accepts 4 integers p, q, r, s from the user where q, r and s are
positive and p is even. If q is greater than r and s is greater than p and if
the sum of r and s is greater than the sum of p and q print "Correct
values", otherwise print "Wrong values".
Test Data :
Input the second integer: 35
Input the third integer: 15
Input the fourth integer: 46
Expected Output:
Wrong values
*/

// use this for Correct values 6 7 5 9

package L2;

import java.util.Scanner;

public class CorrectWrong8 {
    public static void main(String[] args) {
        int p,q,r,s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 int values: ");
        System.out.println("Input the First integer: ");
        p=sc.nextInt();
        System.out.println("Input the second integer: ");
        q=sc.nextInt();
        System.out.println("Input the third integer: ");
        r=sc.nextInt();
        System.out.println("Input the fourth integer: ");
        s=sc.nextInt();

//        System.out.println(q>r);
//        System.out.println(s>p);
//        System.out.println(r+s);
//        System.out.println(p+q);

        if(q>r && s>p && ((r+s)>(p+q))){
            System.out.println("Correct values");
        }else {
            System.out.println("Wrong values");
        }
    }
}
