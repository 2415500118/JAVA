import java.util.*;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);

        //.trim() remove all the extra space which is 
        //in this word

        if(ch >= 'a' && ch<='z'){
            System.out.println("Lowercase");
    
        }
        else{
            System.out.println("Uppercase");
        }

        
    }
    
}
