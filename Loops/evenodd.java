package Loops;

public class evenodd {
    public static void main(String[] args){
        int n = 100;
        int odd=0;
        int even=0;

        for(int i=1;i<=100;i++){
            if(i%2==0){
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even no (1-100): "+even);
        System.out.println("Odd no (1-100): "+odd);
    }
}
