public class c35 {
  public static void main(String args[]) {
    System.out.println("運勢を占います");
    int fortune = new java.util.Random().nextInt(4) + 1;
    switch (fortune) {
      case 1:
        System.out.println("大吉");
        break; //breakを入れ忘れると処理が該当のcaseまで実行されてしまう
      case 2:
        System.out.println("中吉");
        break;
      case 3:
        System.out.println("吉");
        break;
      case 4:
        System.out.println("凶");
    }
  }
}