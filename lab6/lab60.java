import java.io.*;

public class lab60 
{
	public static void main(String[] args) 
	{
		String str = " ";
		int temp;
		try
		{
			BufferedInputStream bf = new BufferedInputStream(System.in);
			do
			{
				temp = bf.read();
				if (temp != -1) 
					str += ((char)temp);	
				
				System.out.println((char)temp);
			}while((char)temp != 's');
		}
		catch(IOException ioe)
		{}	
	}	
}