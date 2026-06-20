package Arrays.Assignments;
import java.util.*;
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc . nextInt();
        int factors = 0;
        for(int i = 1 ; i <= num ; i++){
            if(num % i == 0){
                System.out.print(i + "");
            }

        }
    }
    
    
}
