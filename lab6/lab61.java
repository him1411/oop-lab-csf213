import java.io.*;

class lab61
{
	public static void main(String[] args) 
	{
		String line;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			while(true)
			{
				line = br.readLine();
				System.out.println(line);
				if(line.equals("stop"))
					break;
			}
			System.out.println("Hello " + line);
		}
		catch(Exception e)
			{System.out.println(e);}
	}
}		 