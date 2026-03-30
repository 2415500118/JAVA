import java.util.*;
public class Fibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int b=1;
        int next=0;
    
        for(int i=0 ; i<n ; i++){
            next=a+b;
            a=b;
            b=next;
            // System.out.println(next);   
        }
        System.out.println(next);
        
    }
    
}


/*Intution
Imagine you’re walking step by step.
You remember only the last two steps
To take the next step, you add those two
Then you move forward, forgetting the oldest one
 */