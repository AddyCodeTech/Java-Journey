package Basics;

import java.util.Scanner;
public class operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first no: ");
        int a = sc.nextInt();
        System.out.print("Enter the second no: ");
        int b = sc.nextInt();
        int sum, sub, mul, div;
        sum = a+b;
        sub = a-b;
        mul = a*b;
        div = a/b;

        System.out.print("Addition: " + sum + "\nSubtraction: " + sub + "\nMultiplication: " + mul + "\nDivision: " + div);
        sc.close();
    }
}