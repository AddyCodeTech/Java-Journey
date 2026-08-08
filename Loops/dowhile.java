package Loops;

public class dowhile {
    public static void main(String[] arsgs){
        int i = 1;
        int sum = 0;
        do{
            sum = sum + i;
            i++;
        }while(i<=10);

        System.out.println("Total: "+sum);
    }
}
