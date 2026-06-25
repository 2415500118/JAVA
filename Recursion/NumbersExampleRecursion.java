package Recursion;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        // write a function that takes in a numbers and prints it 
        //print first 5 no 1,2,3,4,5

        print(1);
    }
    static void print(int n){



        //base condition >>> where the function stops
        if(n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n + 1);
    }
} 
    
