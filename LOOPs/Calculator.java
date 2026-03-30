import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.println("Enter operator");
        char op = sc.next().trim().charAt(0);
        if(op == '+' || op == '-'|| op == '/'|| op == '*' || op == '%'){
            System.out.println("Enter Two Nums");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if(op == '+'){
                ans=num1+num2;
            }
            if(op == '-'){
                ans=num1-num2;
            }
            if(op == '/'){
                if(num2!=0){
                ans=num1/num2;
                   }
                }
            if(op == '*'){
                ans=num1*num2;
            }
            if(op == '%'){
                ans=num1%num2;
            }
        else if (op == 'x' || op == 'X'){
            break;
        }
        else{
            System.out.println("Invaild operation");
        }

        }
        System.out.println("Answer" + ans);   

        }
    
 
    }
}


