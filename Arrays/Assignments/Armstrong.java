package Arrays.Assignments;

import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int checknum= num;
    int originalnum = num;
    int temp = 0;
    int sum = 0 ;
    int power = 0;
    while(checknum!=0){
        checknum = checknum / 10;
        power++;
    }
       while(num!=0){
         temp = num % 10;
         temp = (int) Math.pow(temp, power);
         num = num / 10;
         sum=sum + temp;
         temp = 0;  
        }
        if(sum == originalnum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }
    }

 }

