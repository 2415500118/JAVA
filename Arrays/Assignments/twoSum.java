package Arrays.Assignments;
import java.util.*;

public class twoSum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = {2,7,11,15};
    int target = sc.nextInt();
    for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1 ; j < nums.length; j++){
                if((nums[i] + nums[j]) == target){
                    System.out.println(Arrays.toString(new int[] {i , j}));
                }   
            }
        }
    }
}
