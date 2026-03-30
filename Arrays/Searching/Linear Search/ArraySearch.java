public class ArraySearch {
    public static void main(String[] args) {
        int nums[] = {1, -1, 34, 2, -5, 8};
        int target = -1;
        int ans = Search(nums, target);
        System.out.println(ans);
        
    }
    static int Search(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            int element = arr[i];
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
    
}
