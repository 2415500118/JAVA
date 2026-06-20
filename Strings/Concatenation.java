package Strings;
import java.util.ArrayList;
public class Concatenation {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println("a" + 1);

        System.out.println("kunal" + new ArrayList<>());
        System.out.println("kunal" + new Integer(56));

        // System.out.println( new ArrayList<>() + new Integer(56));     >>> Error
        
        
        String ans = new ArrayList<>() + "" + new Integer(56);
        System.out.println(ans);





    }
    
}
