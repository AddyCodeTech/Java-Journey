package Arrays;

import java.util.Scanner;

public class smallest{
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

        int smallest=ar[0];
        System.out.print("\n\nSmallest Element: ");
        for(int i = 0; i<size; i++){
            if(ar[i]<smallest){
                smallest=ar[i];
            }
        }
        System.out.print(smallest);
        sc.close();
    }
}