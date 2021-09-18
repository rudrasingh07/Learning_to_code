package arrays;

public class ShellSort {
    public static void main(String args[]){

        int array[]={20,35,-15,7,55,1,-22};
        //gap is decided as array.length/2 and after each iteration gap is reduced /2 and finally when gap is 1 it becoms
        //insertion sort
        for(int gap= array.length/2; gap >0; gap/=2){
            //i will begin from gap and key will be array[i]
            for(int i=gap;i< array.length;i++){
                int key=array[i];
                // i value is given to j to iterate
                int j=i;

                while(j>=gap && array[j-gap]>key){
                    array[j]=array[j-gap];
                    j=j-gap;//to break the while loop condition
                }
                array[j]=key;
            }
        }
        /*int gap= array.length/2;

        while(gap>0){
            for(int i=gap;i<array.length;i++){
                int key=array[i];

                int j;

                for(j=i;j>=gap && array[j-gap]>key;j-=gap){
                    array[j]=array[j-gap];
                }
                array[j]=key;
            }
            gap=gap/2;
        }*/

        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}
