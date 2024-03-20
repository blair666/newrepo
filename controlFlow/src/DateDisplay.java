import java.util.Scanner;

public class DateDisplay {
    /*
    6. Write a program that accepts an integer between 1 and 7 from the user.
    Use a switch statement to print out the corresponding weekday.
    Print “Out of range” if the number is less than 1 or greater than 7.
     Do not forget to include “break” statements in each of your cases.
     */
    public static void main(String[] args) {
        System.out.println("**** Q6 ****");
        System.out.println("Enter the num from 1 to 7: ");

        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        String output;

        switch (num) {
            case 1:
                output = "Monday";
                break;
            case 2:
                output = "Tuesday";
                break;
            case 3:
                output = "Wednesday";
                break;
            case 4:
                output = "Thursday";
                break;
            case 5:
                output = "Friday";
                break;
            case 6:
                output = "Saturday";
                break;
            case 7:
                output = "Sunday";
                break;
            default:output = "Out of range."; break;
        }
        System.out.println(output);
    }
}
