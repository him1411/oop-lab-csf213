class abc
{
	int x;
	public int x2;
	private int x3;

}
class facti
{
	long calc(int n)
	{
		if(n > 1)
        	return n * calc(n - 1);
    	else
        	return 1;
	}
}
class oops43
{
	public static void main(String[] args) 
	{
		abc i = new abc();
		i.x = 12;
		i.x2 =6;
		//i.x3 = 234;	
		facti x1 = new facti();
		long ans = x1.calc(6);
		System.out.print(ans);
	}
}