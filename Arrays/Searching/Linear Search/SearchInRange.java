public class SearchInRange {
    public static void main(String[] args) {
        int nums[] = {1, -1, 34, 2, -5, 8};
        int target = -1;
        System.out.println(Search(nums, target, 1, 4));
    }

    static int Search(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i = start; i <= end; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
            
        }
        return -1;

    }
    
}
