import java.util.Scanner;

class oops2
{
	public static void main (String args[])
	{
		Scanner scan = new Scanner(System.in);
		//double x = 2.0,y=3.0;
		/*System.out.println("enter rows and coloms of matrix 1 " );
		int m = scan.nextInt();
		int n= scan.nextInt();
		int a[][] = new int[m][n];
		for (int i =0;i<m ;i++ ) 
		{
			for (int j =0 ;j<n ;j++ ) 
				{
					arr[i][j] = scan.nextInt();	
				}	
		}


		System.out.println("enter rows and coloms of matrix 2" );
		int m = scan.nextInt();
		int n= scan.nextInt();
		int a[][] = new int[m][n];
		for (int i =0;i<m ;i++ ) 
		{
			for (int j =0 ;j<n ;j++ ) 
				{
					arr[i][j] = scan.nextInt();	
				}	
		}*/
		int a[][] = { {1,2,3},{4,5,6},{7,8,9}};
		int b[][] = {{1,0,0},{0,1,0},{0,0,1}};
		int c[][] = new int[3][3];		
		for (int i = 0;i<3 ;i++ ) 
		{
			for (int j=0;j<3 ;j++ ) 
			{
				c[i][j]=0;
				for (int k=0;k<3 ;k++ ) 
				{
					c[i][j] += a[i][k]*b[k][j];
				}
				
			}
		}

		for (int i = 0 ;i<3 ;i++ ) 
		{
			for (int j =0;j < 3 ;j++ ) 
			{
				System.out.printf(c[i][j]+ " ");		
			}	
			System.out.printf("%n");
		}

		//System.out.println("The number entered by user: "+ arr[0]+" "+ arr[1]);
	}
}