public class nim
{
    public static void main (String args[])
    {
 new nim ();
    }


    /* Fill in the methods using the comments 
       Don't touch the constructor or the turn method, your team has already finished them.
    */

    public nim ()
    {
 char again = 'y';
 rules ();
 while (again == 'y')
 {
     int left = 15;
     int player = 2;
     String name1 = getName (1);
     String name2 = getName (2);

     while (left > 0)
     {
  if (player == 1)
      player = 2;
  else
      player = 1;
  drawLeft (left);
  whoseturn (player, name1, name2);
  left = turn (left);
     }
     whosewon (player, name1, name2, left, amt);
     again = IBIO.inputChar ("Play again? (y/n) ");
 }
 System.out.println("\nThanks for playing the Game of Nim!");
    }


    public void rules ()
    {

      System.out.println("            Game of Nim            ");
      System.out.println("                Rules              ");
      System.out.println("Thereare 15 stones in the pile. Players take turns taking stones.");
      System.out.println("One each turn, they can take one or two stones. The player who");
      System.out.println("takes the last stone loses.");

    }


    public String getName (int num)
    { 
      String name1 = IBIO.inputString("Please enter your name player 1: ");
      String name2 = IBIO.inputString("Please enter your name player 2: ");
      if(num == 1){
        return name1;
      } else {
        }
 //use the num parameter to get the player number

 return name2;
    }


    public void drawLeft (int left)
    { 
      System.out.println();
      System.out.println("Stones Remaining: "+ left);
      for(int i = 0; i <= left; i++)
      {
        System.out.print("*");
      }
      System.out.println();
//make out a blank line to add white space

 //write "Stones Remaining: " and the number.

 //loop to draw one star for each stone left

    }


    public void whoseturn (int player, String name1, String name2)
    { 
      if(player == 1){
        System.out.println(name1 +"'s turn.");
      } else {
        System.out.println(name2 +"'s turn.");
      }
//if player is 1, it prints that it is name1's turn

 //otherwise, it prints that it is name2's turn

    }


    public boolean isValid (int num, int left)
    { 
      if(num > left){
        return false;
      } else {
      }
//returns false if num is greater than left

 //returns true if num is 1 or 2

 //returns false otherwise
 return true;
    }


    public int turn (int left)
    {
 int amt = IBIO.inputInt ("How enter stones do you want to remove? ");
 while (!isValid (amt, left))
 {
     System.out.println ("That amount is invalid. Try a smaller number.");
     amt = IBIO.inputInt ("How enter stones do you want to remove? ");
 }
 
 return (left - amt);
 return amt;
    }


    public void whosewon (int player, String name1, String name2, int left, int amt)
    { 
      if(player == 1 && left - amt = 0){
        System.out.println(name1 +" has lost. "+ name2 +" forced him to take the last stone.");
      } else if(player == 2 && left - amt = 0){
        System.out.println(name2 +" has lost. "+ name1 +" forced him to take the last stone.");
      }
//if player is 1, then print name1 has lost. name2 forced them to take the last stone.

 //otherwise print a similar message about name2 losing.
    }
}
