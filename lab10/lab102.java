import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class lab102 extends Applet implements ActionListener 
{
    TextField name, pw;
    public void init()
    {
        Label namel = new Label("Name",Label.RIGHT);
        Label pwl = new Label("Password",Label.RIGHT);
        name = new TextField(12);
        pw = new TextField(8);
        pw.setEchoChar('*');
        add(namel);
        add(name);
        add(pwl);
        add(pw);
        name.addActionListener(this);
        pw.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {repaint();}

    public void paint(Graphics g)
    {
        g.drawString("Name :"+name.getText(), 6,60);
        g.drawString("Selected Text :"+ name.getSelectedText(),6,80);
        g.drawString("Password :" + pw.getText(),6,100);
    }
}
