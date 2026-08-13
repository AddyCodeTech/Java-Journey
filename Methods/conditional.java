package Methods;

public class conditional {
    static void intro(String name, int age){
        if(age>18){
            System.out.println(name + " is eligible to vote!\n\n");
        } else {
            System.out.println(name + " is not eligible to vote!\n\n");
        }
    }
    public static void main(String[] arsg){
        intro("Aditya",21);
        intro("Abhishek",22);
        intro("Aman",17);
        intro("Vivek",18);
    }
}
