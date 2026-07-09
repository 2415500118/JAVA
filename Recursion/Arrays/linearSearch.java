package Recursion.Arrays;

import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 9, 6, 8, 9};
        System.out.println(search(arr, 9, 0));        
        System.out.println(searchIndex(arr, 9, 0));
        searchAllIndex(arr, 9, 0);
        System.out.println(list);
    }
    static boolean search(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || search(arr, target, index+1);
    }
    static int searchIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if (arr[index] == target ) {
            return index;
        } else {
           return searchIndex(arr, target, index+1);
        }
    }    
    static ArrayList<Integer> list = new ArrayList<>();
    static void searchAllIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if (arr[index] == target ) {
            list.add(index);
        }
        searchAllIndex(arr, target, index+1);       
        
    } 
}
