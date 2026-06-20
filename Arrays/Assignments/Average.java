package Arrays.Assignments;
import java.util.*;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0 ; i < n ; i++ ){
            int num = sc.nextInt();
            sum = sum + num; 
        }
        double avg =(double) sum / n;
        System.out.println(avg);

    }
    
}
