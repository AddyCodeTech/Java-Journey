package Arrays;

import java.util.Scanner;

public class linear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int flag=0;
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int[] ar = new int[size];
        //initializing
        for(int i = 0; i<size; i++){
            System.out.print("Enter the " + (i+1) + "th elements: ");
            ar[i]=sc.nextInt();
        }
        //displaying
        System.out.print("\n\nDisplay elements: ");
        for(int i = 0;i<size;i++){
            System.out.print(ar[i] + " ");
        }
        System.out.print("\n\n");
        System.out.print("Enter the element to search: ");
        int search = sc.nextInt();
        for (int i=0;i<size;i++) {
            if(search==ar[i]){
                System.out.print("Found the "+search+" at " + i + "th index position!\n");
                flag++;
            }
        }
        System.out.println("\n");
        if(flag==0){
            System.out.println("NoT fOUND!");
        }
        sc.close();
    }
}
