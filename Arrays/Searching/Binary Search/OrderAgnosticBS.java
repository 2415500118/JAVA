public class OrderAgnosticBS {
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, 5, 16, 18, 22, 45};
        int brr[] = {45, 22, 18, 16, 5, 4, -3, -2};
        int target = 22;
        int ans = OrderAgnosticBS(arr ,target);
        int ans2 = OrderAgnosticBS(brr ,target);
        System.out.println(ans);
        System.out.println(ans2);

    }
    static int OrderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid -1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid + 1;
                }

            }
        }
        return -1;
    }
}
