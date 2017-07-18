import java.util.Random;

class Card{
  public static final int TYPE_FIRE = 0;
  public static final int TYPE_WATER = 1;
  public static final int TYPE_GRASS = 2;

  private int type;
  private int number;

  Random rand = new Random();

  Card(){
    type = rand.nextInt(2) + 1;
    number = rand.nextInt(9) + 1;
  }

  Card(int type, int number){
    this.type = type;
    this.number = number;
  }

  int compareTo(Card c){
    int comp = (c.type - type + 3) % 3;

    if (comp == 0){
      if (c.number > number)
        return -1;
      else if (c.number < number)
        return 1;
      else
        return 0;
    }else if (comp == 1)
      return -1;
    else
      return 1;
  }

  @Override
  public String toString(){
    switch (type){
      case 0:
        return "FIRE[" + number + "]";

      case 1:
        return "WATER[" + number + "]";

      case 2:
        return "GRASS[" + number + "]";
    }
    return "NULL";
  }
}
