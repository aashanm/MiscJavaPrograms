import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class skirace extends Applet implements ActionListener
{
  JTextField a1;
  JTextField a2;
  JTextField a3;
  JTextField a4;
  JButton done;
  public void init ()
  {
    JLabel picture = new JLabel(createImageIcon("skirace.jpg"));
    setBackground(Color.cyan);
    JLabel instr = new JLabel("Enter the number of points beside each skier.");
    
    //Image of Players
    JLabel p1 = new JLabel(createImageIcon("player1.jpg"));
    JLabel p2 = new JLabel(createImageIcon("player2.jpg"));
    JLabel p3 = new JLabel(createImageIcon("player3.jpg"));
    JLabel p4 = new JLabel(createImageIcon("player4.jpg"));
    
    //TextFields
    a1 = new JTextField(2);
    a2 = new JTextField(2);
    a3 = new JTextField(2);
    a4 = new JTextField(2);
    
    //Button
    done = new JButton("Done");
    done.addActionListener(this);
    done.setActionCommand("done");
    
    //add
    add(picture);
    add(instr);
    add(p1);
    add(a1);
    add(p2);
    add(a2);
    add(p3);
    add(a3);
    add(p4);
    add(a4);
    add(done);
                                
  }
  
   public void actionPerformed(ActionEvent e)
    {
     if(e.getActionCommand ().equals ("done")){
       int txt1 = Integer.parseInt(a1.getText());
       int txt2 = Integer.parseInt(a2.getText());
       int txt3 = Integer.parseInt(a3.getText());
       int txt4 = Integer.parseInt(a4.getText());
       if(txt1 == 7 && txt2 == 9 && txt3 == 6 && txt4 == 9){
         JOptionPane.showMessageDialog (null, "You got it! Great work!", "Correct", JOptionPane.INFORMATION_MESSAGE);
       } else {
         JOptionPane.showMessageDialog (null, "You are incorrect, please try again.", "Incorrect", JOptionPane.ERROR_MESSAGE);
    }
     } else {
     }
   }
  
    protected static ImageIcon createImageIcon(String path)
  {
    java.net.URL imgURL = skirace.class.getResource (path);
    if (imgURL != null)
    {
      return new ImageIcon (imgURL);
    } else {
      System.err.println("Couldn't find file: " + path);
      return null;
    }
}
}
