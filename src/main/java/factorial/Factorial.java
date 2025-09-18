package factorial;
/*
Write a program that prints a factorial to the screen.

The factorial of a number is found by multiplying itself by all positive integers less than it (excluding 0). For example, 4 factorial, written as 4!, can be computed as follows:

4! == 4 * 3 * 2 * 1 == 24
After taking user input for the factorial they want to find, print out the factorial to the console.
Remember to use a for loop! Java does not have a built in factorial operator.
Example Output:
What number would you like to compute the factorial for? 4
24
*/

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What number would you like to compute the factorial for? ");
        int num = sc.nextInt();
        for (int i = num-1; i > 1; i--){
            num = num * i;
        }
        System.out.println(num);
    }
}
