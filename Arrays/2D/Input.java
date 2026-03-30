import  java.util.*;
public class Input {
    public static void main(String[] args) {
        int row = 2;
        int col = 3;
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[row][col];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
