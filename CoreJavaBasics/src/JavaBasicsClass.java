/*This is for question 1 to 3*/
public class JavaBasicsClass {
    public static void main(String[] args)
    {
        //declares two integer variables
       int num_a = 20;
       int num_b = 53;

       //declares two double variables
        double dnum_a = -42.9;
        double dnum_b = 2953.9;

       //adds them together
        //Exercise 1 integer sum
       int sum_int = num_a + num_b;
       System.out.println("Exercise 1 :The sum of integer " + num_a + " and " + num_b + " is: " + sum_int );

       //Exercise 2 double sum
       double sum_double = dnum_a + dnum_b;
       System.out.println("Exercise 2 :The sum of double " + dnum_a + " and " + dnum_b + " is: " + sum_double );

       //Exercise 3 integer and double sum
       double sum_a = num_a + dnum_a;
       double sum_b = num_b + dnum_b;
       System.out.println("Exercise 3a: The sum of integer num_a and double dnum_a " + num_a + " and " + dnum_a + " is: " + sum_a );
       System.out.println("Exercise 3b: The sum of integer num_b and double dnum_b " + num_a + " and " + dnum_a + " is: " + sum_b);

       //Exercise 4  two integer variables; divides the larger by the smaller number
        double result_a = num_b / num_a;
        System.out.println("Exercise 4a :The result of integer dividing " + num_b + " by " + num_a + " is: " + result_a );

        // change num_b to decimal
        double numb_to_d = 53.0;
        result_a = numb_to_d / num_a;
        System.out.println("Exercise 4b : After change the larger number to a decimal, the result of integer dividing " + numb_to_d + " by " + num_a + " is: " + result_a );

        //Exercise 5  two integer variables; divides the larger by the smaller number
        double result_b = dnum_b / dnum_a;
        System.out.println("Exercise 5a :The result of double dividing " + dnum_b + " by " + dnum_a + " is: " + result_b  );

        //casting the result_b
        //int int_result_b = (int)result_b;
        System.out.println("Exercise 5b :Casting th result to an integer " +  (int) result_b);

        //Exercise 6   Declare a variable q and assign y/x to it and print q
        int x = 5;
        int y = 6;
        double q = y / x;
        System.out.println("Exercise 6a: The result of dividing " + y + " by " + x + " is: " + q );

        //cast y to a double and assign it to q
        q = (double)y;
        System.out.println("Exercise 6b: The value of casting to a double is: " + q);

        //Exercise 7   Declares a named constant and uses it in a calculation
        final double PI = 3.14159;
        double r = 5;
        double area = r * r * PI;
        System.out.println("Exercise 7: The area with radius " + r + " is: " + area);


        /*
        Write a program where you create three variables that represent products at a cafe.
        The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        Assign prices to each product. Create two more variables called subtotal and totalSale and complete an “order” for three items
        of the first product, four items of the second product, and two items of the third product.
        Add them all together to calculate the subtotal.
        Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
        Be sure to format the results to two decimal places.
         */
        //Exercise 8 cafe
        double cappuccinoPrice = 7.50;
        double lattePrice = 6.50;
        double greenTeaPrice = 6.00;

        double subtotal;
        double totalSale;

        int cappuccinoQuality = 3;
        int latteQuality = 4;
        int greenTeaQuality = 2;

        final double SALES_TAX = 0.10;

        subtotal = (cappuccinoPrice * cappuccinoQuality) + (lattePrice * latteQuality) +(greenTeaPrice * greenTeaQuality);
        totalSale = subtotal + (subtotal * SALES_TAX);
        System.out.printf("Exercise 8: Subtotal: $%.2f \n Total Sale: $%.2f", subtotal, totalSale);

    }
}