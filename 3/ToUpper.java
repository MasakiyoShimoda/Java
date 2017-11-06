import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;

class ToUpper{
  public static void main(String[] args) {
    ArrayList<String> lines = new ArrayList<String>();
    String upper = "";
    try{
      File file = new File("test.txt");
      FileWriter filewriter = new FileWriter(file);

      Scanner scan = new Scanner(System.in);
      System.out.print("input String:\n");

      while (scan.hasNextLine()) {
        String str = scan.nextLine();
        upper = upper + str.toUpperCase() + "\n";
      }
      filewriter.write(upper);

      filewriter.close();

    }catch(IOException e){
      System.out.println(e);
    }
  }
}
