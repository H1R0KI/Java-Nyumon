public class c53 {
  public static void methodA() {
    System.out.println("methodA");
    methodB();
  }
  public static void methodB() {
    System.out.println("methodB");
  }
  public static void main(String args[]) { //必ずmainから実行される
    methodA();
  }
}