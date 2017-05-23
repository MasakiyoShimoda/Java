class Rectangle{
  int height, width;

  int getArea(){
    return height * width;
  }

  void draw(boolean fills){
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        if (fills == true)
          System.out.print("*");
        else {
          if (i == 0 || i == height - 1)
            System.out.print("*");
          else if (j == 0 || j == width - 1)
            System.out.print("*");
          else
            System.out.print(" ");
        }
      }
      System.out.println("");
    }
  }
}
