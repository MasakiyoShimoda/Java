import java.util.Scanner;

class CalcSum{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("データの数は?");
    double n = scan.nextDouble();

    int num[] = new int[64];
    int sum = 0;

    for (int i = 0; i < n; i++) {
      System.out.print("Input number :");
      num[i] = scan.nextInt();
      sum += num[i];
    }
    double average = sum / n;
    String ave = String.format("%.1f", average);
    System.out.println("sum: " + sum);
    System.out.println("average: " + ave);
  }
}
