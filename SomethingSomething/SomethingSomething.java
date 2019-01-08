
import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SomethingSomething extends Applet implements ActionListener
{

JButton b1 = new JButton;
 JButton b2 = new JButton;
 JButton b3 = new JButton;
 JButton b4 = new JButton;
 JButton b5 = new JButton;
 JButton b6 = new JButton;
 JButton b7 = new JButton;
 JButton b8 = new JButton;
 
 public void init ()
 {
  JLabel title = new JLabel ("The Something Something");
  title.setFont (new Font ("Arial", Font.BOLD, 20));
  
  JLabel instr = new JLabel ("Press the buttons to randomize a sentence.");
  instr.setFont (new Font ("Arial", Font.BOLD, 12));
  
  add (title);
  add (instr);
  add (b1);
  add (b2);
  add (b3);
  add (b4);
  add (b5);
  add (b6);
  add (b7);
  add (b8);
 }
 
public void actionPerformed (ActionEvent e)
{
 if (e.getActionCommand ().equals ("1"))
 {
  int r = (int)(Math.random()*3);
  if (r==0)
   b1.setText ("The");
  else if (r==1)
   b1.setText ("A");
  else
   b1.setText ("This");
 }
  
   else if (e.getActionCommand ().equals ("2"))
 {
  int r2 = (int)(Math.random()*5);
  if (r2==0)
   b2.setText ("Tall");
  else if (r2==1)
   b2.setText ("Green");
  else if (r3==2)
   b2.setText ("Silent");
  else if (r3==3)
   b2.setText ("Old");
  else if (r4==4)
   b2.setText ("Expensive");   
 }
 
   else if (e.getActionCommand ().equals ("3"))
 {
  int r3 = (int)(Math.random()*3);
  if (r3==0)
   b3.setText ("Boy");
  else if (r2==1)
   b3.setText ("Wheat");
  else if (r3==2)
   b3.setText ("Policy"); 
 }
 
   else if (e.getActionCommand ().equals ("4"))
 {
  int r4 = (int)(Math.random()*5);
  if (r4==0)
   b4.setText ("Arrived");
  else if (r2==1)
   b4.setText ("Slithered");
  else if (r3==2)
   b4.setText ("Bounced");
  else if (r3==3)
   b4.setText ("Dashed");
  else
   b4.setText ("Flew");
 }
 
   else if (e.getActionCommand ().equals ("5"))
 {
  int r5 = (int)(Math.random()*3);
  if (r5==0)
   b5.setText ("By");
  else if (r5==1)
   b5.setText ("To");
  else 
   b5.setText ("Near");
 }
 
   else if (e.getActionCommand ().equals ("6"))
 {
  int r6 = (int)(Math.random()*3);
  if (r6==0)
   b6.setText ("A");
  else if (r6==1)
   b6.setText ("The");
  else 
   b6.setText ("This");
 }
 
    else if (e.getActionCommand ().equals ("7"))
 {
  int r7 = (int)(Math.random()*4);
  if (r7==0)
   b7.setText ("Stunning");
  else if (r7==1)
   b7.setText ("Wonderful");
  else if (r7==2)
   b7.setText ("Dreadful");
  else
   b7.setText ("Dingy");
 }
 
    else if (e.getActionCommand ().equals ("8"))
 {
  int r8 = (int)(Math.random()*5);
  if (r8==0)
   b8.setText ("Cave");
  else if (r8==1)
   b8.setText ("Rock");
  else if (r8==2)
   b8.setText ("Skyscraper");
  else if (r8==3)
   b8.setText ("Fence");
  else
   b8.setText ("Baseball Diamond");
 }
}
