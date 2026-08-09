package Arrays;

import java.util.Scanner;

public class bubblesorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();
        int[] ar=new int[n];
        int i,j,temp;
        for(i=0;i<n;i++){
            System.out.print("Enter the " +(i+1)+ "th element: ");
            ar[i]=sc.nextInt();
        }
        System.out.println("\n\nDisplay Elements: ");
        for(i=0;i<n;i++){
            System.out.print(ar[i]+" ");
        }

        System.out.print("\n\nBubble Sorted: ");
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(ar[j]>ar[j+1]){
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        for(j=0;j<n;j++){
            System.out.print(ar[j]+" ");
        }
        sc.close();
    }    
}
