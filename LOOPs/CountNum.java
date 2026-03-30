import java.util.Scanner;
public class CountNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int num = sc.nextInt();
        System.out.println("enter no to find");
        int n = sc.nextInt();
        int count = 0;
        int rem = 0;
        while(num!=0){
            rem=num%10;
            if(rem==n){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
    
}
