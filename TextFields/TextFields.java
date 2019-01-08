import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TextFields extends Applet implements ActionListener
{
JTextField input;
JLabel output;
JTextField input2;
JLabel output2;
JTextField input3;
JLabel output3;

 public void init ()
 {
 resize (500, 200);
 JLabel ins = new JLabel ("Enter a number less than 100: ");
 ins.setFont (new Font ("Arial", Font.PLAIN, 20));
 input = new JTextField (3);
 
 JButton check = new JButton ("Check Number");
 check.addActionListener (this);
 check.setActionCommand ("c");
 
 output = new JLabel ("");
 JLabel ins2 = new JLabel ("Enter the number of copies: ");
 ins2.setFont (new Font ("Arial", Font.PLAIN, 20));
 input2 = new JTextField (3);
 
 JButton price = new JButton ("Price");
 price.addActionListener (this);
 price.setActionCommand ("p");
 
 output2 = new JLabel ("");
 JLabel ins3 = new JLabel ("Enter your model number: ");
 ins3.setFont (new Font ("Arial", Font.PLAIN, 20));
 input3 = new JTextField (3);
 
 JButton evaluate = new JButton ("Evaluate");
 evaluate.addActionListener (this);
 evaluate.setActionCommand ("e");
 
 output3 = new JLabel ("");
 
 add (ins);
 add (input);
 add (check);
 add (output);
 add (ins2);
 add (input2);
 add (price);
 add (output2);
 add (ins3);
 add (input3);
 add (evaluate);
 add (output3);
 }
 
public void actionPerformed (ActionEvent e)
{
int txt = Integer.parseInt (input.getText());
int txt2 = Integer.parseInt (input2.getText());
int txt3 = Integer.parseInt (input3.getText());

 if (e.getActionCommand ().equals ("c"))
 {
 if (txt > 10 && txt <= 0)
  output.setText ("The number is a one digit number.");
 else 
  output.setText ("The number is a two digit number.");
 }
 if (e.getActionCommand().equals ("p"))
 {
 if (txt2 >= 0 && txt2 < 500)
  output2.setText ("Price per copy is $0.30");
 else if (txt2 >= 500 && txt2 < 750)
  output2.setText ("Price per copy is $0.28");
 else if (txt2 >= 750 && txt2 < 1000)
  output2.setText ("Price per copy is $0.27");
 else
  output2.setText ("Price per copy is $0.25");
 }
 if (e.getActionCommand ().equals ("e"))
 {
 if (txt3 == 119 || txt3 == 179 || txt3 == 189 || txt3 == 190 || txt3 == 191 || txt3 == 192 || txt3 == 193 || txt3 == 194 || txt3 == 195 || txt3 == 221 || txt3 == 780)
  output3.setText ("Your car is defective.");
 else
  output3.setText ("Your car is fine.");
 }
}

}
