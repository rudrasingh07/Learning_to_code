package arrays;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n= sc.nextInt();
        int array[] = new int[n];
        for(int k=0; k< array.length; k++){
            array[k]=sc.nextInt();
        }

        for(int i= array.length-1; i>0; i--){
            for(int j=0 ; j<i; j++) {
                if (array[j] > array[j + 1]) {
                    /*int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;*/
                    swap( array, j, j+1);
                }
            }
        }

        for(int i=0; i< array.length; i++){
            System.out.println(array[i]);
        }

    }

    public static void swap(int array[], int i, int j){
        if (i==j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;


    }

}
