import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class lab91 extends Applet implements ActionListener
{

	String msg = " ";
	Button yes,no, maybe;
	public void init()
	{
		yes = new Button("Yes");
		no  = new Button("No");
		maybe = new Button("May be");
		yes.addActionListener(this);
		no.addActionListener(this);
		maybe.addActionListener(this);
		add(yes);
		add(no);
		add(maybe);
	}

	public void actionPerformed(ActionEvent e)
	{
    
		String str = e.getActionCommand();
		if(str.equals("Yes"))
			msg = "Pressed Yes";

		else if(str.equals("No"))
			msg = "Pressed No";

		else
			msg = "Pressed MayBe";

		repaint();
    }

}