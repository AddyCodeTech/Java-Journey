package Methods;

public class recursion {
  static int sum(int k) {
    for(int i = 0; i<k; i++){
      if(i>=5){
        return k + sum(k-1);
      }
    }
    return k;
  }

  public static void main(String[] args) {
    int result = sum(10);
    System.out.println(result);
  }
}
