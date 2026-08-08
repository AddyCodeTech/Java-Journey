package Basics;

import java.util.Scanner;
public class calculator {
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

        System.out.print("========Arithmetic Operation========\n");
        System.out.print("\t1) Addition\n");
        System.out.print("\t2) Subtraction\n");
        System.out.print("\t3) Multiplication\n");
        System.out.print("\t4) Division\n");
        System.out.print("====================================");

        System.out.print("\nEnter your Choice: ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.print("\n\nSum is: " + sum);
                break;
            case 2:
                System.out.print("\n\nSub is: " + sub);
                break;
            case 3:
                System.out.print("\n\nMul is: " + mul);
                break;
            case 4:
                System.out.print("\n\nDiv is: " + div);
                break;
            default:
                System.out.print("\n\nERROR!");
                break;
        }
        sc.close();
    }
}
