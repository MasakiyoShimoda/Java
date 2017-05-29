import java.util.Scanner;

class CountWord{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Input String: ");
    String str = scan.nextLine();
    int words = 0;
    boolean word = false;

    for (int i = 0; i < str.length(); i++) {
      char s = str.charAt(i);
      if ('A' <= s && s <= 'Z' || 'a' <= s && s <= 'z' || '0' <= s && s <= '9') {
        if (word != true || i == 0)
          words++;
        word = true;
      }else
        word = false;
    }

    System.out.println(words);
  }
}
