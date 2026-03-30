package Assignments;
import java.util.*;
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amt");
        int P = sc.nextInt();
        System.out.println("Enter Rate of Intrest");
        int R = sc.nextInt();
        System.out.println("Enter Time");
        int T = sc.nextInt();
        System.out.println("Simple Intrest = " + (P*R*T)/100);
        

    }
}
