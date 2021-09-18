package arrays;

import java.util.Scanner;

public class Factorial_iterative {
    public static void main(String args[]){
        long number;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to be calculate for factorial");
        number=sc.nextInt();



        System.out.println("Output from iterative method:"+fatorialIterative(number));
        System.out.println("Output from Recursive method:"+factorialRecursive(number));

    }

    public static long fatorialIterative(long number){

        for(long i=number-1;i>0;i--){
            number=number*i;
        }

        return number;

    }

    public static long factorialRecursive(long number){

        if (number==0){
            // this is break point for the recursive function call, if this not met then
            // we get stack over flow error
            return 1;
        }

        return number* factorialRecursive(number-1);
    }

}
