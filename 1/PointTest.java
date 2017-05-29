import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

class PointTest{
  public static void main(String[] args) {
    int range = 10;
    int xn = 10, yn = 10, count = 0, far = 0, near = 0;
    double[] distance = new double[range];
    double[] distance2 = new double[range];

    Random rnd = new Random();
    Scanner scan = new Scanner(System.in);
    Point point[] = new Point[range];
    for (int i = 0; i < range; i++)
      point[i] = new Point(rnd.nextInt(xn), rnd.nextInt(yn));

    for (int i = 0; i < yn; i++) {
      for (int j = 0; j < xn; j++) {
        for (int k = 0; k <range; k++) {
          if (point[k].x == j && point[k].y == i) {
            System.out.print(k + " ");
            break;
          }else if (k == range-1)
            System.out.print(". ");
        }
      }
      System.out.println("");
    }

    System.out.print("どの点について調べますか？: ");
    int search = scan.nextInt();
    for (int i = 0; i < range; i++) {
      distance[i] = point[i].getDistance(point[i], point[search].x, point[search].y);
      distance2[i] = point[i].getDistance(point[i], point[search].x, point[search].y);
    }
    Arrays.sort(distance);
    for (int i = 0; i < range; i++)
      if (distance2[i] == distance[range-1])
        far = i;
      else if (distance2[i] == distance[1])
        near = i;

    System.out.println("最も遠い点" + far + "(距離 " + String.format("%.3f", distance[range-1]) + ")");
    System.out.println("最も近い点" + near + "(距離 " + String.format("%.3f", distance[1]) + ")");
  }
}

class Point{
  int x, y;
  Point(int x, int y){
    this.x = x;
    this.y = y;
  }

  double getDistance(Point p, int xc, int yc)
    return Math.sqrt(Math.pow((xc - x), 2) + Math.pow((yc - y), 2));
}
