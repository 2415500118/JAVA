import java.util.*;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int newnum=0;
        int rem=0;
        while(num!=0){
            rem=num%10;
            num=num/10;
            newnum=newnum*10+rem;
            rem=0;
        }
        System.out.println(newnum);
    }  
}
