package Methods;

public class overloading {
    static int intro(int x, int y){
        return x + y;
    }

    static int intro1(int x, int y){
        return x + y;
    }

    public static void main(String[] args){
        System.out.println(intro(11,19));
        System.out.println(intro1(21,29));
    }
}
