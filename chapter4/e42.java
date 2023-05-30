public class e42 {
  public static void main(String args[]) {
    int [] money = {121902, 8302, 55100};
    for (int i = 0; i < money.length; i++) {
      System.out.println(money[i]);
    }
    for (int value : money) {
      System.out.println(value);
    }
  }
}