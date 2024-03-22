public class Mult {
    public static void main(String[] args)
    {
        /*1: Print a Multiplication Table
        Write a program that uses nested for loops to print a multiplication table.*/

        //int size = 12;
        int mult;
        for (int i=1; i <=12;i++)
        {
            System.out.println("Here is 'i' " + i);
            for (int j=1; j<=12; j++)
            {
                System.out.println("Here is 'j' " + j);
                mult = i * j;
                System.out.println("Here is 'mult' " + mult);
            }
        }
    }
}