import java.io.*;

class lab66
{
	public static void main(String[] args)
	{
		FileInputStream fis =null;
		FileOutputStream fos=null;
		BufferedInputStream br=null;
		BufferedWriter bw=null;
		try
		{
			try
			{
				fis = new FileInputStream("Files/aboutme.txt");
				br = new BufferedInputStream(fis);
			}
			catch(ArrayIndexOutOfBoundsException aioe)
			{	System.out.println("Incorrect input format");}

			try
			{
				fos = new FileOutputStream("Files/copy");
				bw = new BufferedWriter(new OutputStreamWriter(fos));
			}
			catch(ArrayIndexOutOfBoundsException aioe)
			{	System.out.println("Incorrect input format");}

			int temp;
			do
			{
				temp = br.read();
				fos.write(temp)
			}while(temp != -1);
		}
		catch (FileNotFoundException fnfe)
		{System.out.println("File location for " + fnfe + "is incorrect " );}
		catch(Exception e)
		{}
	}
}