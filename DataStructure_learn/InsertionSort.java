package arrays;

public class InsertionSort {
    public static void main(String args[]){
        int array[]= {20,35,-15,7,55,1,-22};
        //the sorting is done from smallest to largest (left to right)
        //index 0 is considered as sorted index
        //index 1 will we our key to iterate

        for(int i=1;i< array.length;i++){
            //first loop starting from 1st index
            int key=array[i];//assign the 'i' value to key
            int j;
            for(j=i;j>0 && array[j-1]>key;j--){//if 20>25
                array[j]=array[j-1];
                //it will shift the elements not swap
            }
            array[j]=key;
            //once the element is found after shifting than assign that finally to a[j] the final postion
            // that is the smallest element comes to the first position and others get shifted by once position back
        }

        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }


}
