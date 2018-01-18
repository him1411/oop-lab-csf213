import java.util.Scanner;
class oops23  
{
	public static void main(String[] args) throws java io IOException
	{
		Scanner scan = new Scanner(System.in);
		int a[][] = new int[3][];
		a[0] = new int[2];
		a[1] = new int[4];
		a[2] = new int[5];
		//a = {{1,2},{3,4,5,6},{7,8,9,10}};
		for (int i=0;i<2 ;i++ ) 
		{
			a[0][i]=scan.nextInt();	
		}
		System.out.print(a[0][0]+" "+a[0][1]);
	}
}