
/*
Find the Greatest Common Divisor
Write a program that prompts the user to enter two positive integers,
and find their greatest common divisor (GCD).
Examples:
Enter 2 and 4. The gcd is 2.
Enter 16 and 24.  The gcd is 8.
How do you find the gcd?
Name the two input integers n1 and n2.
You know number 1 is a common divisor, but it may not be the gcd.
Check whether k (for k = 2, 3, 4, and so on) is a common divisor for n1 and n2,
until k is greater than n1 or n2.
*/
import java.util.Scanner;
public class GreatestCommonDivisor {
    public static void main(String[] args)
    {
        int n1, n2;
        int gcd = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        n1 = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        n2 = sc.nextInt();

        //find the minimum between two numbers n1 & n2
        int min = Math.min(n1,n2);

        for(int k =2; k<=min; k++)
        {
            if (n1 % k == 0 && n2 % k == 0)
            {
                gcd = k;
            }
        }

        System.out.print( "Enter " + n1 + " and " + n2 +". The gcd is " + gcd +".");
    }

}
