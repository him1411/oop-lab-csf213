class lab73 extends Thread
{
	lab73(String tname)
	{
		super(tname);
		start();
	}
	public void run()
	{
		System.out.println("Started Execution of ChildThread");
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread()+" is printing:"+i);
			try
			{
				sleep(2000);
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
		}
		System.out.println(Thread.currentThread()+" has completed execution");
	}
	public static void main(String args[])
	{
		lab73 tjd=new lab73("Child"); 
		Thread t=Thread.currentThread();
		t.setName("Master");
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread()+" is printing:"+i);
			try
			{
				if(i==2)
				{
					tjd.join();
				}
				t.sleep(2000);
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
		}
		System.out.println(Thread.currentThread()+" has compelted exectution");
	}
}