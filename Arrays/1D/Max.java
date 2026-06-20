package Arrays;
import java.util.*;
public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,5};

    
        int max = Max(arr);
        System.out.println(max);
    }

 public static int Max(int[] arr){
    int max = -1;
    for(int num : arr){
        if(num > max){
            max = num;
        }
    }
    return max;

 }

    
}
