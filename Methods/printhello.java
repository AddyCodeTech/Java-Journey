package Methods;

public class printhello {
    public static void printhello1() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 4) {
                printhello1();
            }
        }
    }
}
