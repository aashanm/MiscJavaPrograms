import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class basic extends Applet implements ActionListener
{
 JButton a[] = new JButton [7];
 int secret = (int)(Math.random()*6)+0;
 
 public void init ()
 {
 Panel g = new Panel ();
 for (int i = 0 ; i < a.length ; i++)
 {
 a [i] = new JButton ("" + i);
 a [i].addActionListener (this);
 a [i].setActionCommand ("" + i);
 a [i].setBackground (Color.yellow);
 g.add (a [i]);
 }
 add (g);
 resize (400, 50);
 }
 public void actionPerformed (ActionEvent e)
 {
 int i = Integer.parseInt (e.getActionCommand ());
 showStatus ("You pressed button #" + i);
 
 if (e.getActionCommand().equals ("" + secret)) {
  showStatus ("found it!"); 
  a [0].setBackground (Color.yellow);
  a [1].setBackground (Color.yellow);
  a [2].setBackground (Color.yellow);
  a [3].setBackground (Color.yellow);
  a [4].setBackground (Color.yellow);
  a [5].setBackground (Color.yellow);
  a [6].setBackground (Color.yellow);
  secret = (int)(Math.random()*6)+0; }
  
 else
  a [i].setBackground (Color.black);
  
 }
}
