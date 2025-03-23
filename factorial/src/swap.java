import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
             swap(arr,1,2);
        rev(arr);
        System.out.println(Arrays.toString(arr)) ;
    }
    static  void rev(int[] arr){
        int st=0;
        int end=arr.length-1;
        while (st<end){
            swap(arr,st,end );
            st++;
            end--;
        }
    }
    public static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
       // System.out.println(Arrays.toString(arr));
    }
}
