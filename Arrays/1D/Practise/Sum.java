package Arrays.Practise;
import java.util.*;
public class Sum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(4);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());

            
        }
        int result = sum(list);
        System.out.println(result);

        
        
    }
    static int sum(ArrayList<Integer> list ){
        int sum = 0;
        for(int num : list){
            sum = sum + num;
        }
        return sum;
    }
}
