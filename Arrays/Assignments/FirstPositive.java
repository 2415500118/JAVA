package Arrays.Assignments;
//https://leetcode.com/problems/first-missing-positive/?envType=problem-list-v2&envId=we0l51z2
// Amazon
public class FirstPositive {
    public int firstMissingPositive(int[] nums){
    int minVal = nums[0];
    for(int i : nums){
        if(nums  < minVal){
            minVal = nums;
        }  
    }
    int i = 0;
    while(i < nums.length){
        int correct = nums[i] - minVal;
        if(nums[i] != correct){
            swap(arr, i, correct);
        }
        else{
            i++;
        }
    }
    for(int index = 0; index < nums.length; index++){
        if(nums[i]>0){
            if(nums[index] != index + 1){
            return new int[] {nums[index]};
            }
        }
    }
}
    
    static void swap(int[] arr ,  int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
 
    }
    
}
