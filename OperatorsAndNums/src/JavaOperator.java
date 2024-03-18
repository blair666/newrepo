public class JavaOperator {
    public static void main(String[] args)
    {

// Task 1
    /*
    Write a program that declares an integer a variable x, assigns the value 2 to it,
    and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
    Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
    Before printing the results, write a comment with the predicted decimal value and binary string.
    Now, print out x in decimal form and in binary notation.
    Perform the preceding exercise with the following values:
    a.9 b.17 c.88
    */

        //  the left shift operator (<<) => adding at the end
        System.out.println("Task 1");
        int x = 2; // 1 0
        System.out.println("The original value of x: " + x + ", Binary: " + Integer.toBinaryString(x));

        x = x << 1; // 1 0 0
        System.out.println("After x << 1, the predicted decimal value: " + x + ", Binary: " + Integer.toBinaryString(x) + "\n");
        //System.out.println("After x << 1, the binary string is: " + Integer.toBinaryString(x) + "\n");

        //x = 9; // 8 + 1 => 1 0 0 1
        //x = x << 1; // 1 0 0 1 0
        //System.out.println("When x = 9, x << 1, the predicted decimal value: " + x);
        //System.out.println("After x << 1, the binary string is: " + Integer.toBinaryString(x) + "\n");

        //x = 17; // 16 + 1 => 1 0 0 0 1
        //x = x << 1; // 1 0 0 0 1 0
        //System.out.println("When x = 17, x << 1, the predicted decimal value: " + x);
        //System.out.println("After x << 1, the binary string is: " + Integer.toBinaryString(x) + "\n");

        //x = 88; // 64 + 16 + 8 = 1 0 1 1 0 0 0
        //x = x << 1; // 1 0 1 1 0 0 0 0
        //System.out.println("When x = 88, x << 1, the predicted decimal value: " + x);
        //System.out.println("After x << 1, the binary string is: " + Integer.toBinaryString(x) + "\n");

        shiftToLeft(9);
        shiftToLeft(17);
        shiftToLeft(88);
//Task 2
    /*
    Write a program that declares a variable x, and assigns 150 to it,
    and prints out the binary string version of the number.
    Now use the right shift operator (>>) to shift by 2 and assign the result to x.
    Write a comment indicating what you anticipate the decimal and binary values to be.
    Now print the value of x and the binary string.
    Perform the preceding exercise with the following values:
    a.225 b.1555 c.32456
    */

        //the right shift operator (>>) => removing at the end & no matter 0 || 1
        System.out.println("***************************\n");
        System.out.println("Task 2");
        x = 150; // 1 0 0 1 0 1 1 0
        System.out.println("The original value of x: " + x + ", Binary: " + Integer.toBinaryString(x));

        x = x >> 2; // 1 0 0 1 0 1
        System.out.println("After x >> 2, the predicted decimal value: " + x + ", Binary: " + Integer.toBinaryString(x) + "\n");

//        x = 225; // 1 1 1 0 0 0 0 1
//        x = x >> 2; // 1 1 1 0 0 0
//        System.out.println("When x = 225, x >> 2, the predicted decimal value: " + x);
//        System.out.println("After x >> 2, the binary string is: " + Integer.toBinaryString(x) + "\n");

//        x = 1555; // 1 1 0 0 0 0 0 1 1
//        x = x >> 2; // 1 1 0 0 0 0 0
//        System.out.println("When x = 1555, x >> 2, the predicted decimal value: " + x);
//        System.out.println("After x >> 2, the binary string is: " + Integer.toBinaryString(x) + "\n");

//        x = 32456;// 1 1 1 1 1 1 0 1 1 0 0 1 0 0 0
//        x = x >> 2;//  1 1 1 1 1 1 0 1 1 0 0 1 0
//        System.out.println("When x = 88, x >> 2, the predicted decimal value: " + x);
//        System.out.println("After x >> 2, the binary string is: " + Integer.toBinaryString(x) + "\n");

        shiftToRight(225);
        shiftToRight(1555);
        shiftToRight(32456);

//Task 3
    /*
    Write a program that declares three int variables: x, y, and z. Assign 7 to x and 17 to y.
    Write a comment that indicates what you predict will be the result of the bitwise and operation on x and y.
    Now use the bitwise AND (&) operator to derive the decimal and binary values, and assign the result to z.
    */
        System.out.println("***************************\n");
        System.out.println("Task 3");
        x = 7; // 1 1 1
        int y = 17;// 1 0 0 0 1
        System.out.println("The original value of x: " + x + ", Binary: " + Integer.toBinaryString(x));
        System.out.println("The original value of y: " + y + ", Binary: " + Integer.toBinaryString(y));

        //  0 0 1 1 1
        //& 1 0 0 0 1
        //= 0 0 0 0 1
        double z = x & y;// 0 0 0 0 1
        System.out.println("The decimal of " + x + " & " + y + ": " + z);
        System.out.println("The binary of " + x + " & " + y + ": " + Integer.toBinaryString((int)z));
//Task 4
    /*
    Now, with the preceding values, use the bitwise and operator to calculate the “or” value between x and y.
    As before, write a comment that indicates what you predict the values to be before printing them out.
    */
        System.out.println("***************************\n");
        System.out.println("Task 4");
        //   0 0 1 1 1
        //or 1 0 0 0 1
        //=  1 0 1 1 1
        int value = x | y;
        System.out.println("The decimal of " + x + " | " + y + ": " + value);
        System.out.println("The binary of " + x + " | " + y + ": " + Integer.toBinaryString(value));

//Task 5
    /*
    Write a program that declares an integer variable, assigns a number,
    and uses a postfix increment operator to increase the value.
    Print the value before and after the increment operator
    */
        System.out.println("***************************\n");
        System.out.println("Task 5");
        int a = 20;
        //print the value before the increment operator
        System.out.println("The num is " + a);
        a++;
        //print the value after the increment operator
        System.out.println("After increasing, the num is " + a);


//Task 6
    /*
    Write a program that demonstrates at least three ways to increment a variable by 1 and does this multiple times.
    Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print it again
    */
        System.out.println("***************************\n");
        System.out.println("Task 6");

        int m_num = 8;

        // postfix increment
        //print the value before the increment operator
        System.out.println("The original num is " + m_num);
        m_num++;
        //print the value after the increment operator
        System.out.println("m_num++, the num is " + m_num + "\n");

        // prefix increment
        //print the value before the increment operator
        System.out.println("The original num is " + m_num);
        ++m_num;
        //print the value after the increment operator
        System.out.println("++m_num, the num is " + m_num + "\n");

        // increment by adding 1
        //print the value before the increment operator
        System.out.println("The original num is " + m_num);
        m_num = m_num +1 ;
        //print the value after the increment operator
        System.out.println("After adding 1, the num is " + m_num + "\n");




//Task 7
    /*
    Write a program that declares two integer variables: x, and y, and then assigns 5 to x and 8 to y.
    Create another variable sum and assign the value of ++x added to y, and print the result.
    Notice the value of the sum (should be 14). Now change the increment operator to postfix (x++) and re-run the program.
    Notice what the value of the sum is. The first configuration incremented x, and then calculated the sum,
    while the second configuration calculated the sum, and then incremented x.
    */

        System.out.println("***************************\n");
        System.out.println("Task 7");

        int j = 5;
        int q = 8;

        //Using prefix increment operator (++x)
        int sum = ++j + q;
        System.out.println("Using prefix increment operator (++x), the sum is " + sum);

        //set back 5 to j
        j = 5;
        //Using postfix increment operator (x++)
        int sum2 = j++ + q;
        System.out.println("Using postfix increment operator (x++), the sum is " + sum2);

    }

    // method for task 1
    public static void shiftToLeft(int num) {
        System.out.println("The original value of x: " + num + ", Binary: " + Integer.toBinaryString(num));
        num = num << 1;
        System.out.println("After x << 1, the predicted decimal value: " + num + ", Binary: " + Integer.toBinaryString(num) + "\n");
    }

    // method for task 2
    public static void shiftToRight(int num) {
        System.out.println("The original value of x: " + num + ", Binary: " + Integer.toBinaryString(num));
        num = num >> 2;
        System.out.println("After x >> 2, the predicted decimal value: " + num + ", Binary: " + Integer.toBinaryString(num) + "\n");
    }
}