package Loops;

public class average {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }


        float avg = (float) sum / n; 

        System.out.println("Total Sum is: " + sum);

        System.out.printf("Average is: %f", avg); 
    }
}
