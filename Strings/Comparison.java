package Strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "kunal";
        String b = "kunal";

        //System.out.println(a==b); >>>> True
        //System.out.println(a.equals(b)); >>>True  bcause value is same 

        String name1 = new String("kunal");
        String name2 = new String("kunal");


        //System.out.println(name1 == name2);   >>> False
        //System.out.println(name1.equals(name2));   >>> True


        // fetch the chararcter in a string
        System.out.println(name1.charAt(0));


    }
}
