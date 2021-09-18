package arrays;

public class SelectionSort {
    public static void main(String args[]) {
        int array[] = {20, 44, 0, -5, -15, 11, 5};

        for (int i = array.length - 1; i > 0; i--) {
            //starting from last index as we sort the biggest element first

            int largest_index = 0;//0th index is set as largest element

            for (int j = 1; j <= i; j++) {
                //loop starts from 1st index
                if (array[j] > array[largest_index]) {
                    //now compare each element from 1 to last with largest index element untill we the if condition
                    //is satisfied
                    largest_index = j;
                    //once found assign that largest element index to largest index
                }
            }
            swap(array, largest_index, i);
            //swap that largest element index with last element of array
        }

        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static void swap(int arr[], int i, int j) {
        if (i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
