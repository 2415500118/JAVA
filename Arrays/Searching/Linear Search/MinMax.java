import java.util.*;
public class MinMax {
    public static void main(String[] args) {
         int[] arr = {18, 12, 7, 3, 14, 28, -3, 4};
         int min = min(arr);
         int max = max(arr);
         min=min(arr);
         System.out.println(min);
         max = max(arr);
         System.out.println(max);
    }
    static int max(int[] arr){
        int max = arr[0];
        for(int element : arr){
            if(element > max){
                max = element;
            } 
        }
        return max;
    }
    static int min(int[] arr){
        int min = arr[0];
        for(int element : arr){
            if(element < min){
                min = element;
            }
        }

        return min;
        
    }
    
}
