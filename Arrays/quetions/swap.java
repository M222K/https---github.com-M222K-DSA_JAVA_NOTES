//swap values in an array?
import java.util.*;

public class swap {
    public static void main(String[] args) {
        Scanner in= new Scanner ( System.in);
        
        int[] arr= new int[4];

        for(int i=0 ; i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        swap(arr,0,3);

    }
    static void swap(int[]arr ,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        System.out.println(Arrays.toString(arr));

    }
}