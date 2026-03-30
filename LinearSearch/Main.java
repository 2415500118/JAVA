package LinearSearch;

public class Main {
    public static void main(String[] args) {
         int[] nums = {23, 45, 1, 2, 8, -2, 16, -11, 28};
        int target = 10;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target ){
        if (arr.length == 0){
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            int element = arr[i];
            if(element == target){
                return i;

            }

        }

        //this line will execute if none of the return above have executed
        //hence the target not found
        return -1;
    }    
    
}