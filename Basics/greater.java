package Basics;

import java.util.Scanner;
public class greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Inputting four value
        System.out.print("Enter the first noe: ");
        int a = sc.nextInt();
        System.out.print("Enter the second no: ");
        int b = sc.nextInt();
        System.out.print("Enter the third no: ");
        int c = sc.nextInt();
        System.out.print("Enter the fourth no: ");
        int d = sc.nextInt();

        if(a>b && a>c && a>d){
            System.out.println("A is Greater!");
        } else if (b>c && b>d){
            System.out.println("B is Greater!");
        } else if (c>d) {
            System.out.println("C is Greater!");
        } else {
            System.out.println("D is Greater!");
        }

        
        sc.close();
    }
}
