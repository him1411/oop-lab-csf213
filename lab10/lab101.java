import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class lab101 extends Applet implements AdjustmentListener ,MouseMotionListener
{

    String msg = "" ;
    Scrollbar hor,vert;
    
    public void init()
    {

        int width = Integer.parseInt(getParameter("width"));
        int height = Integer.parseInt(getParameter("height"));
        
        vert = new Scrollbar(Scrollbar.VERTICAL,0,1,0,height);
        hor = new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,width);
        vert.setPreferredSize(new Dimension(20,100));
        hor.setPreferredSize(new Dimension(200,20));
        add(vert);
        add(hor);
        vert.addAdjustmentListener(this);
        hor.addAdjustmentListener(this);
        addMouseMotionListener(this);
    }


    public void adjustmentValueChanged(AdjustmentEvent ae)
    {
        repaint();
    }    

    public void mouseDragged(MouseEvent me)
    {
        int x = me.getX();
        int y = me.getY();
        vert.setValue(y);
        hor.setValue(x);
        repaint();      
    }
    public void mouseMoved(MouseEvent me){}


    public void paint(Graphics g)    
    {
        msg = "vertical Value" + vert.getValue();
        msg += " horizontal Value" + hor.getValue();
        g.drawString(msg,6,160);
        g.drawString("*",hor.getValue(),vert.getValue());
    }
}