package Arrays;
import java.util.*;
public class Input {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // array of primitives
        // int[] arr = new int[5];

        // //input using for loops
        // for(int i = 0; i < arr.length; i++){
        //     arr[i] = sc.nextInt();


        // }
        // System.out.println(Arrays.toString(arr));

        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i] + " ") ;
        // }


        //Enhanced for loop

        // for(int num : arr){ // for every element in array , print the element
        //     System.out.println(num + " "); // here num represents element of the array
        // }
        //System.out.println(arr[5]); // index out of bound error



        // Array of objects
        String[] str = new String[4];
        for(int i = 0; i < str.length; i++){
            str[i] = sc.next();

        }

        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "kunal";
        System.out.println(Arrays.toString(str));

    }

    
}
