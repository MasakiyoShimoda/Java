public class StringChar{
  public static void main(String[] args) {
    if (args.length > 2 || args.length == 0 || args[0].length() < Integer.parseInt(args[1])) {
      System.out.println("引数の数が正しくありません");
      return;
    }
    System.out.println(args[0].charAt(Integer.parseInt(args[1]) - 1));
  }
}
