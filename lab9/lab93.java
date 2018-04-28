import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class lab93 extends Applet implements ItemListener
{
    String msg = "";
    Choice  OS,browse;
    public void init()
    {
        OS= new Choice();
        browse = new Choice();
        
        OS.add("Window");
        OS.add("android");
        OS.add("mac");
        browse.add("IE");
        browse.add("Chrome");
        browse.add("Firefox");
        
        OS.addItemListener(this);
        browse.addItemListener(this);
        
        add(OS);
        add(browse);
        
        setLayout(new FlowLayout(FlowLayout.LEFT, 30,30));

    }

    public void itemStateChanged(ItemEvent e)
    {
        repaint();
    }

    public void paint(Graphics g)
    {
        msg ="Current OS: ";
        msg += OS.getSelectedItem();
        g.drawString(msg,6,80);
        msg ="Current Browser: ";
        
        msg += browse.getSelectedItem();
        g.drawString(msg,6,100);
    }
}