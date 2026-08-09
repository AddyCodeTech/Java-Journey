package Arrays;

import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int[] ar=new int[n];
        for(int i = 0; i<n; i++){
            System.out.print("Enter the elements: ");
            ar[i]=sc.nextInt();
        }
        System.out.print("\n\nDisplay Elements: ");
        for(int i = 0; i<n; i++){
             System.out.print(ar[i]+" ");
        }
        System.out.print("\n\nSum: ");
        for(int i = 0; i<n; i++){
            sum=sum+ar[i];
        }
        System.out.print(sum/n);
        sc.close();
    }
}
