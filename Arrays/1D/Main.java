package Arrays; 

public class Main {
    public static void main(String[] args) {
        
        //Syntax
        //datatype[] variable_name = new datatype[size];
        //datatype : data type of which type data is stored in Array
        //store 5 roll no
        int[] rnos = new int[5];
        //or directly
        int[] rnos2 = {23, 12, 45, 32, 15};

        int[] ros; // decleration of array. rod is getting defined in the stack
        ros = new int[5]; //initialisation of array .actually here object is being created in the heap memory
        // array had dynamic memory allocation means memory is allocated at the runtime/execution time
        


        String[] arr = new String[4];
        System.out.println(arr[0]);

        //null is a literal

        //String str = null;
        //int num = null;
        //we can not create a null type
        //null is the defalut value of what reference variable point to
        

    }
}
