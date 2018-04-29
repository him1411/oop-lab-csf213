class Printer
{
	synchronized void print(String str)
	{
		System.out.print("["+str);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
		System.out.print("]");
	}
}

class PrintThread implements Runnable
{
	Printer pr;
	String message;
	PrintThread(Printer p,String msg)
	{
		pr=p;
		message=msg;
	}
	public void run()
	{
		pr.print(message);
	}
	public static void main(String args[])
	{
		Printer prn=new Printer();
		Thread t1=new Thread(new PrintThread(prn,"HELLO"),"ONE");
		Thread t2=new Thread(new PrintThread(prn,"SYNC"),"TWO");
		Thread t3=new Thread(new PrintThread(prn,"WORLD"),"THREE");
		t1.start();
		t2.start();
		t3.start();
		try
		{
			Thread.sleep(8000);
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
	}
}