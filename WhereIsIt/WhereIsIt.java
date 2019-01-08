import java.awt.*; import java.awt.event.*; import java.applet.*;
import javax.swing.*;
public class WhereIsIt extends Applet implements ActionListener
{
 JButton [] a;
 int row = 10; int col = 10;
 int total = row * col;
 int hiddenX = (int) ((Math.random () * 9) + 1);
 int hiddenY = (int) ((Math.random () * 9) + 1);
 public void init ()
 {
 Panel p = new Panel (new GridLayout (row, col, 0, 0));
 resize (500, 400);
 a = new JButton [total];
 for (int nNum = 0 ; nNum < total ; nNum++)
 {
 a [nNum] = new JButton ("0");
 p.add (a [nNum]);
 a [nNum].addActionListener (this);
 a [nNum].setBackground (Color.white);
 a [nNum].setActionCommand ("" + nNum);
 }
 add (p);
 JButton reset = new JButton ("Reset");
 reset.addActionListener (this);
 reset.setActionCommand ("-1");
 add (reset);
 }
 public void actionPerformed (ActionEvent e)
 {
 int pos = Integer.parseInt (e.getActionCommand ());
 if (pos == -1)
 { //add reset code here
 }
 else
 {
 //find i and j
 int i = pos / row;
 int j = pos % row;
 if (i == hiddenX && j == hiddenY)
 {
 a [pos].setBackground (Color.red);
 showStatus ("You win!");
 }
 else if ((i + 1 == hiddenX || i == hiddenX || i - 1 == hiddenX) && j + 1 ==
hiddenY)
 {
 a [pos].setBackground (Color.orange);
 }
 else if ((i + 1 == hiddenX || i - 1 == hiddenX) && j == hiddenY)
 {
 a [pos].setBackground (Color.orange);
 }
 else if ((i + 1 == hiddenX || i == hiddenX || i - 1 == hiddenX) && j - 1 ==
hiddenY)
 {
 a [pos].setBackground (Color.orange);
 }
 else if (i == hiddenX || j == hiddenY)
 {
 a [pos].setBackground (Color.yellow);
 }
 }
 }
}
