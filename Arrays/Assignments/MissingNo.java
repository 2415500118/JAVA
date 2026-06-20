package Arrays.Assignments;
public class MissingNo {
    int nums [] = {4,2,0,1};
     int n = nums.length;
        int sum = n*(n+1)/2;
        int s = 0;
        for(int i = 0; i < nums.length; i++){
            s = s + nums[i];
        }
        int res = sum - s;
        // res = res -1;
        
        return res;
}
