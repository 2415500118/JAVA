package Arrays.Assignments;
//https://leetcode.com/problems/find-the-duplicate-number/submissions/2035686009/?envType=problem-list-v2&envId=we0l51z2
//Google, Amazon
public class DuplicateNo {
    public int findDuplicate(int[] arr){
    int i = 0;
        while(i < arr.length) {
            if(arr[i] != i+1){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            } 
            else{
                return arr[i];
            }
            }
            else{
                i++;
            } 
        }
        return -1;
    }       
static void swap(int[] arr ,  int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
 
    }
}
