import java.applet.*;
import java.awt.*;

public class lab80 extends Applet
{
    public void init()
    {
        setBackground(Color.cyan);
        setForeground(Color.red);
    }
    public void start()
    {}
    public void paint(Graphics g)
    {
        g.drawString("Helloworld",250,175);
    }
}