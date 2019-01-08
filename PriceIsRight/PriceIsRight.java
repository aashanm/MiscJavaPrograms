public class PriceisRight
{
  public static void main(String args[])
  {
    new PriceisRight();
  }
  public PriceisRight()
  {
    boolean choice;
    choice = true;
    while(choice == true)
    {
    System.out.println("Welcome to the price is right!");
    System.out.println();
    String c1 = IBIO.inputString("Name of contestant #1: ");
    String c2 = IBIO.inputString("Name of contestant #2: ");
    String c3 = IBIO.inputString("Name of contestant #3: ");
    String c4 = IBIO.inputString("Name of contestant #4: ");
    System.out.println();
    
    int num = (int)(Math.random() * 5);
      int price = 0;
      String object = "Brown";
      if(num == 1){
        object = ("Sofa");
        price = 987;
      } else if(num == 2){
        object = ("TV");
        price = 500;
      } else if(num == 3){
        object = ("Loveseat");
        price = 984;
      } else if(num == 4){
        object = ("Computer");
        price = 435;
      } else if(num == 5){
        object = ("Dining set");
        price = 895;
      }
      
    System.out.println("The item to bid on is a "+ object +".");
    System.out.println("The contestant who is the closest without going");
    System.out.println("over wins. The maximum bid is $1000.");
    System.out.println();
    
    int b1 = IBIO.inputInt(c1 +", what is your bid: ");
    int b2 = IBIO.inputInt(c2 +", what is your bid: ");
    int b3 = IBIO.inputInt(c3 +", what is your bid: ");
    int b4 = IBIO.inputInt(c4 +", what is your bid: ");

    int v1 = price - b1;
    int v2 = price - b2;
    int v3 = price - b3;
    int v4 = price - b4;
    if(v1 < v2 && v1 < v3 && v1 < v4 && v1 >= 0){
      System.out.println(c1 +", wins. The price was "+ price);
    } else if(v2 < v1 && v1 < v3 && v1 < v4 && v2 > 0){
      System.out.println(c2 +", wins. The price was "+ price);
    } else if(v3 < v1 && v3 < v2 && v3 < v4 && v3 >= 0){
      System.out.println(c3 +", wins. The price was "+ price);
    } else {
      System.out.println(c4 +", wins. The price was "+ price);
    }
    System.out.println();
    char pick = IBIO.inputChar("Would you like to play again?(y/n)");
    if(pick == 'y'){
      choice = true;
    } else {
      choice = false;
    }
    }
  }
}
