import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = factobhai(num);
        System.out.println(ans);
    }
    static int factobhai(int num){
        if(num == 1 || num ==0){
            return 1;
        }
        else{
            return num*factobhai(num-1);
        }
    }
    
}