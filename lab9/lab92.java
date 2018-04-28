import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class lab92 extends Applet implements ItemListener
{
    String msg = "";

    Checkbox  win,android,mac;
    public void init()
    {
        win = new Checkbox("Win",null,true);
        android = new Checkbox("Android",null,true);
        mac = new Checkbox("MAC",null,true);
        
        add(win);
        add(android);
        add(mac);
        win.addItemListener(this);
        android.addItemListener(this);
        mac.addItemListener(this);
        setLayout(new FlowLayout(FlowLayout.LEFT, 30,30));
    }

    public void itemStateChanged(ItemEvent e)
    {   repaint();}

    public void paint(Graphics g)
    {
        msg ="Current State";
        g.drawString(msg,6,80);
        msg = win.getLabel() +":" + win.getState();
        g.drawString(msg,6,100);
        msg = android.getLabel() +":" + android.getState();
        g.drawString(msg,6,120);
        msg = mac.getLabel() +":" + mac.getState();
        g.drawString(msg,6,140);
   	}
}