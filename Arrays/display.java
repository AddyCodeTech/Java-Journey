package Arrays;

import java.util.Scanner;

public class display{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] ar = new int[size];
        // initializing array
        for(int i = 0; i<size; i++){
            System.out.print("Enter the elements: ");
            ar[i]=sc.nextInt();
        }
        System.out.print("\n\nDisplay Elements: ");
        // display array
        for(int i = 0; i<size; i++){
             System.out.print(ar[i]+" ");
        }
        sc.close();
    }
}
