import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        1. Write a program that declares 1 integer variable x, and then assigns 7 to it.
        Write an if statement to print out “Less than 10” if x is less than 10.
        Change x to equal 15, and notice the result (console should not display anything)
        */
        System.out.println("**** Q1 ****");
        int x = 15;
        if (x < 10)
        {
            System.out.println("Less than 10\n");
        }

        /*
        2. Write a program that declares 1 integer variable x, and then assigns 7 to it.
        Write an if-else statement that prints out “Less than 10” if x is less than 10,
        and “Greater than 10” if x is greater than 10.
        Change x to 15 and notice the result.
        */
        System.out.println("**** Q2 ****");
        int y = 15;
        if(y < 10)
        {
            System.out.println("Less than 10\n");
        }
        else
        {
            System.out.println("Greater than 10\n");
        }

        /*
        3. Write a program that declares 1 integer variable x, and then assigns 15 to it.
        Write an if-else-if statement that prints out “Less than 10” if x is less than 10;
        “Between 10 and 20” if x is greater than 10 but less than 20,
        and “Greater than or equal to 20” if x is greater than or equal to 20.
        Change x to 50 and notice the result.
        */
        System.out.println("**** Q3 **** ");
        int z = 50;
        if(z < 10)
        {
            System.out.println("Less than 10\n");
        }
        else if (10 < z && z < 20)
        {
            System.out.println("Between 10 and 20\n");
        }else if ( z >= 20)
        {
            System.out.println("Greater than or equal to 20\n");
        }


        /*
        4. Write a program that declares 1 integer variable x, and then assigns 15 to it.
        Write an if-else statement that prints “Out of range” if the number is less than 10 or greater than 20
        and prints “In range” if the number is between 10 and 20 (including equal to 10 or 20).
        Change x to 5 and notice the result.
        */
        System.out.println("**** Q4 ****");
        int a = 15;
        if(a < 10 || a > 20)
        {
            System.out.println("Out of range\n");
        }
        else if (10 <= a && a <= 20)
        {
            System.out.println("In range\n");
        }

        /*
        5. Write a program that uses if-else-if statements to print out grades A, B, C, D, F,
        according to the following criteria:
        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: <60
        Use the Scanner class to accept a number score from the user to determine the letter grade.
        Print out “Score out of range” if the score is less than 0 or greater than 100.
        */

        System.out.println("**** Q5 **** ");
        int score;
        System.out.println("Enter the score number: ");
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();
        if(score >=90 && score <=100)
        {
            System.out.println("Your Grade is A ");
        } else if (score >=80 && score <=89)
        {
            System.out.println("Your Grade is B ");
        }else if (score >=70 && score <=79)
        {
            System.out.println("Your Grade is C ");
        }else if (score >=60 && score <=69)
        {
            System.out.println("Your Grade is D ");
        }else if (score <60)
        {
            System.out.println("Your Grade is F ");
        }else if (score >100 || score <0)
        {
            System.out.println("Score out of range");
        }


    }

}