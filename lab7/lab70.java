class lab70 implements Runnable
{
	public void run()
	{
		Thread t = Thread.currentThread();
		System.out.println(t.currentThread()+" started execution ");
		for (int i=0;i<5 ;i++ ) 
		{
			try
			{
				System.out.println(Thread.currentThread()+" is printing"+ i);
				t.sleep(1000);
			}
			catch(InterruptedException ie)
			{System.out.println(Thread.currentThread()+"is interupted");}
		}
		System.out.println(Thread.currentThread()+" has been completed ");
	}

	public static void main(String[] args) 
	{
		lab70 td = new lab70();
		Thread tchild = new Thread(td,"child thread");
		tchild.start();
		Thread tmain = Thread.currentThread();
		tmain.setName("Main thread ");
		for (int i=0;i<5;i++ ) 
		{
			try
			{
				System.out.println(Thread.currentThread()+" is printing " + i);
				tmain.sleep(2000);
			}		
			catch(InterruptedException ie)
			{	System.out.println(Thread.currentThread()+"has been interupted");}
		}	
		System.out.println(Thread.currentThread()+ " has completed execution");
	}
}