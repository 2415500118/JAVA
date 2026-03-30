package Arrays;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
    

        //<" "> here we cannot pass premitive datatype we have to pass raper classes
        ArrayList<Integer> list = new ArrayList<>(4);

        // list.add(67);
        // list.add(47);
        // list.add(45);
        // list.add(87);
        // list.add(87);
        // list.add(56);
        

        // System.out.println(list);
        Scanner sc = new Scanner(System.in);
        //input 
        for(int i = 0; i<5; i++){
            list.add(sc.nextInt());

        }

        //get item at any index
        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i));
        }





        

    }
    
}
