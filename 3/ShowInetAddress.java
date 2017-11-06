import java.net.InetAddress;

class ShowInetAddress {
  public static void main(String args[]) {
    try {
      InetAddress ipList[] = InetAddress.getAllByName(args[0]);

      for(int i=0; i<ipList.length; ++i) {
        byte bytes[] = ipList[i].getAddress();
        for(int j=0; j<bytes.length; ++j) {
          if(bytes[j]>=0) System.out.print(bytes[j]);
          else System.out.print(bytes[j] + 256);

          if(j<bytes.length-1) System.out.print(".");
        }
        System.out.println("");
      }
    }
    catch(Exception e) {
      System.out.println("ホストが解決できませんでした.");
    }
  }
}
