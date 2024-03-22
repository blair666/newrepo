import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
/*
Task 1: Write a program that creates an array of integers with a length of 3.
Assign the values 1, 2, and 3 to the indexes. Print out each array element.
*/
        System.out.println("**** Task 1 ****");

        //create array
        //int[] num = {1, 2, 3};

        // access each array elements
//        System.out.println("Accessing Elements of an Array:");
//        System.out.println("First Element: " + num[0]);
//        System.out.println("Second Element: " + num[1]);
//        System.out.println("Third Element: " + num[2]);


        // Set the Java array size to three
        int[] num = new int[3];
        num[0] =1;
        num[1] =2;
        num[2] =3;

        for (int i = 0; i < num.length; i++) {
            System.out.println("Element at index " + i + ": " + num[i]);
        }
        System.out.println("\n");
/*
Task 2: Write a program that returns the middle element in an array.
Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
 */

        System.out.println("**** Task 2 ****");
        int[] m_array = {13, 5, 7, 68, 2};
//        System.out.println("The middle Element: " + m_array[2]+"\n");

        //if even number of array elements are present
        if (m_array.length %2 == 0)
        {
            System.out.println("The middle elements are: ");

            // even-length array (two middle elements)
            int x = m_array[(m_array.length/2) - 1];
            System.out.println(x);
            int y = m_array[m_array.length/2];
            System.out.println(y);
        } else
        {
            //if odd number of array elements are present
            int middle = m_array.length/2;
            System.out.println("The middle Element: " + m_array[middle]+"\n");
        }
        System.out.println("\n");


/*
Task 3: Write a program that creates an array of String type and initializes it with the strings “red,” “green,” “blue,” and “yellow.”
Print out the array length. Make a copy using the clone( ) method.
Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
*/
        System.out.println("**** Task 3 ****");
        String[] colors = {"red", "green","blue","yellow"};
        int l_colors= colors.length;
        System.out.println("The array length: " +l_colors);

        // clone() method is inherited from Object class
        String[] c_copies = colors.clone();
        System.out.println("The original Array: " + Arrays.toString(colors));
        System.out.println("The copied Array: " + Arrays.toString(c_copies));
        System.out.println("\n");

/*
Task 4: Write a program that creates an integer array with 5 elements (i.e., numbers).
The numbers can be any integers.
Print out the value at the first index and the last index using length - 1 as the index.
Now try printing the value at index = length (e.g., myArray[myArray.length] ).
Notice the type of exception which is produced.
Now try to assign a value to the array index 5. You should get the same type of exception
*/
        System.out.println("**** Task 4 ****");

        int[] m_nums = {20, 35, 29, 26, 10};
        int len = m_nums.length;
        System.out.println("The first index is: " + m_nums[0]);
        System.out.println("The last index is: " + m_nums[len - 1]);
        //System.out.println("The value at index = length is: " + m_nums[len]);
        //m_nums[5] = 8;
        //System.out.println("After assigning a value to the array index 5, the last index is: " + m_nums[len - 1]);

/*
Task 5: Write a program where you create an integer array with a length of 5.
Loop through the array and assign the value of the loop control variable
(e.g., i) to the corresponding index in the array.
*/
        System.out.println("**** Task 5 ****");
        // Create an integer array with a length of 5
        int[] interArr =new int[5];

        for(int i=0; i < interArr.length; i++ )
        {
            interArr[i] = i;
            System.out.println("Index " + i + ": " + interArr[i]);
        }
        System.out.println("\n");


/*
Task 6: Write a program where you create an integer array of 5 numbers.
Loop through the array and assign the value of the loop control variable
multiplied by 2 to the corresponding index in the array.
*/
        System.out.println("**** Task 6 ****");
        // Create an integer array with a length of 5
        int[] interArr2 =new int[5];

        for(int i=0; i < interArr2.length; i++ )
        {
            interArr2[i] = 2 * i;
            System.out.println("Index " + i + ": " + interArr2[i]);
        }
        System.out.println("\n");
/*
Task 7: Write a program where you create an array of 5 elements.
Loop through the array and print the value of each element, except for the middle (index 2) element
*/
        System.out.println("**** Task 7 ****");
        int[] t_arrary = {8,20,10,26,94};

        for(int i=0; i < t_arrary.length; i++ )
        {
            if (i != 2)
            {
                System.out.println("Index " + i + ": " + t_arrary[i]);
            }
        }
        System.out.println("\n");

/*
Task 8: Write a program that creates a String array of 5 elements
and swaps the first element with the middle element without creating a new array.
 */

        System.out.println("**** Task 8 ****");
        String[] str = {"one","two","three","four","five"};
        System.out.println("The original String is : " + Arrays.toString(str));
        String temp = str[0];
        str[0] = str[2];
        str[2] = temp;
        System.out.println("After swaping the first element with the middle element: " + Arrays.toString(str)+"\n");



/*Task 9:
Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
Print the array in ascending order, and print the smallest and the largest element of the array.
The output will look like the following:
Array in ascending order: 0, 1, 2, 4, 9, 13
The smallest number is 0
The biggest number is 13
*/
        System.out.println("**** Task 9 ****");
        int[] arr = {4, 2, 9, 13, 1, 0};
        System.out.println("The original array is: "+ Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("The sorted array is: "+ Arrays.toString(arr));
        System.out.println("\n");


/*
Task 10: Create an array that includes an integer, 3 strings, and 1 double. Print the array.
*/

        System.out.println("**** Task 10 ****");

/*
Task 11: Write some Java code that asks the user how many favorite things they have.
Based on their answer, you should create a String array of the correct size.
Then ask the user to enter the things and store them in the array you created.
Finally, print out the contents of the array.

Example
How many favorite things do you have?
7

Enter your thing: phone
Enter your thing: tv
Enter your thing: xbox
Enter your thing: wine
Enter your thing: beer
Enter your thing: sofa
Enter your thing: book
Your favorite  things are:
phone tv xbox wine beer sofa book
*/

        System.out.println("**** Task 11 ****");





        

    }


}