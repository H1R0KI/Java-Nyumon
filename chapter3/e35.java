public class e35 {
  public static void main(String args[]) {
    System.out.print("[メニュー]1:検索 2:登録 > ");
    int selected = new java.util.Scanner(System.in).nextInt();
    switch (selected) {
      case 1:
        System.out.println("検索します");
        break;
      case 2:
        System.out.println("登録します");
        break;
    }
  }
}