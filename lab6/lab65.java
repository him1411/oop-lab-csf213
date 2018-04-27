import java.io.*;

class lab65
{
	public static void main(String[] args) 
	{
		File infile = new File("Files/aboutme.txt");
		try
		{
			FileReader inread = new FileReader(infile);
			FileWriter otwrit = new FileWriter("Files/copy.txt");
			BufferedReader buffinp = new BufferedReader(inread);
			BufferedWriter buffop = new BufferedWriter(otwrit);
			String text;
			while ( (text = buffinp.readLine()) != null ) 
			{
				buffop.write(text);
				buffop.newLine();	
			}
			buffop.write("*************copied content***********");
			buffop.newLine();
			System.out.println("completed copy");
			buffop.close();
			otwrit.close();
		}
		catch(Exception e)
		{System.out.println(e);}
	}
}