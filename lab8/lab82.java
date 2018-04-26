import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class lab82 extends Applet implements KeyListener
{
    String msg = " " ;
    int x =20;
    int y =10;
    public void init()
    {
        addKeyListener(this);
    }
    public void keyPressed(KeyEvent ke)
    {
        showStatus("KeyDown");
    }
    public void keyReleased(KeyEvent ke)
    {
        showStatus("Key UP");
    }
    public void keyTyped(KeyEvent ke)
    {
        msg += ke.getKeyChar();
        repaint();
    }
    public void paint(Graphics G)
    {
        G.drawString(msg,x,y);
    }


}