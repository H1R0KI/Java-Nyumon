public class e43 {
  public static void main(String args[]) {
    int [] numbers = {3, 4, 9};
    System.out.println("１桁の数字を入力してください");
    int input = new java.util.Scanner(System.in).nextInt();
    for (int value : numbers) {
      if (value == input) {
        System.out.println("BINGO");
      }
    }
  }
}