import java.io.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code=bang2.class width=300 height=400></applet>*/

class frame1 extends Frame
{
	frame1(String title)
	{
		super(title);
		MyWindowAdapter ad=new MyWindowAdapter(this);
		addWindowListener(ad);
	}
	public void paint(Graphics g)
	{
		g.drawString("This is a frame Window",10,40);
	}
}

class MyWindowAdapter extends WindowAdapter
{
	frame1 f1;
	public MyWindowAdapter(frame1 f1)
	{
		this.f1=f1;
	}
	public void windowClosing(WindowEvent we)
	{
		f1.setVisible(false);
	}

}


public class bang2 extends Applet implements 
ActionListener,ItemListener
{

	Label customer,deposit,accno,widthdraw;
	TextField cust,dept,number,draw;
	TextArea t;
	Choice type;
	Checkbox yes,nu;
	CheckboxGroup te;

	Frame f;

	Button b;

	public void init()
	{

		f=new frame1("A frame window");
		f.setSize(250,250);
		f.setVisible(true);

		setBackground(Color.yellow);
		setForeground(Color.red);


		customer=new Label("CUSTOMER");
		deposit=new Label("DEPOSIT");
		accno=new Label("ACCOUNT NUMBER");
		widthdraw=new Label("WIDTHDRAW");

		cust=new TextField(20);
		dept=new TextField(20);
		number=new TextField(20);
		draw=new TextField(20);

		type=new Choice();
		type.add("FIXED");
		type.add("RD");
//		type.add("SECOND CLASS");

		te=new CheckboxGroup();
		yes=new Checkbox(te,"YES",false);
       		nu=new Checkbox(te,"NO",false);


		t=new TextArea(40,45);

		b=new Button("submit");

		add(customer);
		add(cust);

		add(accno);
		add(number);

		add(deposit);
		add(dept);

		add(widthdraw);
		add(draw);

		add(type);
		add(b);

		add(yes);
		add(nu);

		add(t);

		b.addActionListener(this);
		type.addItemListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("submit"))
		{
			t.setText("NAME: " +cust.getText()+ " " + "ACCOUNT NUMBER :" + number.getText()+"  "  +  " DEPOSIT AMOUNT : "+dept.getText()+ " " + "TYPE OF ACCOUNT : "+type.getSelectedItem());
		}
	}

	public void itemStateChanged(ItemEvent ie)
        {

        }
}