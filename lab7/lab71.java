import java.util.Random;

class Box
{
	int val;
	synchronized void fillBox()
	{
		System.out.println(Thread.currentThread()+" is running in fill box.");
		if(val!=0)
		{
			notify();
			try
			{
				wait();
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
		}
		else
		{
			Random rand=new Random();
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
			System.out.println("Filling the box");
			val=rand.nextInt(50)+1;
			notify();
			System.out.println("Completed filling the box");
			try
			{
				wait();
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
			notify();
		}
	}
	synchronized void clearBox()
	{
		System.out.println(Thread.currentThread()+" is running in clear box.");
		if(val==0)
		{
			notify();
			try
			{
				wait();
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
			notify();
		}
		else
		{	
			System.out.println(val);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
			System.out.println("Emptying the box");	
			val=0;
			notify();
			System.out.println("Completed Empyting the box");
			try
			{
				wait();
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
			notify();
		}
	}
}
class Producer implements Runnable
{
	Box b;
	Producer(Box b)
	{
		this.b=b;
	}
	public void run()
	{
		b.fillBox();
	}
}

class Consumer implements Runnable
{
	Box b;
	Consumer(Box b)
	{
		this.b=b;
	}
	public void run()
	{
		b.clearBox();
	}
}

class lab71
{
	public static void main(String args[])
	{
		Box b=new Box();
		Thread tprod=new Thread(new Producer(b),"ONE");
		Thread tcons=new Thread(new Consumer(b),"TWO");
		tcons.start();
		tprod.start();
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
	}
}