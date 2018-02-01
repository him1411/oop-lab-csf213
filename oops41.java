class box
{
	int h,l,b;
	box(int a,int d,int c)
	{
		h=a;
		l=d;
		b=c;
		System.out.println(h +""+ l +""+ b);
	}
	box(int a)
	{
		h = a;
		System.out.println("sngle integer constructor");
	}
	box(double a)
	{
		h = (int) a;
		System.out.println("sngle float constructor");
	}
};

class oops41
{
	public static void main(String[] args) 
	{
			box a1 = new box(3,4,5);
			box a2 = new box(2);
			box a3 = new box(3.0);
	}
}