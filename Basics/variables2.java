package Basics;

import java.util.Scanner;
public class variables2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First no: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second no: ");
        int b = sc.nextInt();

        System.out.print("Sum: "+(a+b));
        sc.close();
    }
}