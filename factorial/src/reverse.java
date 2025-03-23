import java.util.Arrays;

import static java.util.Collections.swap;


public class reverse {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr));
        swap(arr, 0, 2);
        }
    public static void swap(int[] arr,int index1,int index2){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        System.out.println(Arrays.toString(arr));
        }
    }



