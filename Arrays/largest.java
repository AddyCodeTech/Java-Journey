package Arrays;

import java.util.Scanner;

public class largest{
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

        int largest=ar[0];
        System.out.print("\n\nLargest Element: ");
        for(int i = 0; i<size; i++){
            if(ar[i]>largest){
                largest=ar[i];
            }
        }
        System.out.print(largest);
        sc.close();
    }
}