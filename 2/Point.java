class Point extends Object{
  int x, y;
  Point(int x, int y){
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString(){
    return "x:" + x + ", y:" + y;
  }
}
