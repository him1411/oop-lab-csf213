import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;

public class lab103 extends Applet
{
    String p ;
    public void init()
    {
        JFrame mainframe = new JFrame("Application");
        mainframe.setLayout(null);
        mainframe.setSize(800,800);
        mainframe.setVisible(true);

        JPanel mainpanel = new JPanel(null);//panel to hold login page
        mainframe.add(mainpanel);
        mainpanel.setBounds(0,0,800,800);

        JLabel welcome1 = new JLabel("Welcome to the Quiz Generator");//welcome label
        mainpanel.add(welcome1);
        welcome1.setBounds(250,10,390,30);

        JTextField t = new JTextField("",20);
        mainpanel.add(t);
        t.setBounds(300,40,100,40);

        JButton b = new JButton("Change");
        mainpanel.add(b);
        b.setBounds(200,40,100,40);

        JTextField t2 = new JTextField("",20);
        mainpanel.add(t2);
        t2.setBounds(300,80,100,40);
        t2.setText(p);

        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                p = t.getText();
                t2.setText(p);
            }
        });      
    }
}
