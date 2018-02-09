class abc
{
	void function1(int a,int b)
	{
		System.out.println(a*b);
	}
	void function1 (int a, int b, int c )
	{
		System.out.println(a*b*c);
	}
};
class oops40
{
	public static void main(String[] args) 
	{
		abc v1 = new abc();
		v1.function1(2,3);
		v1.function1(2,3,4);

	}
}