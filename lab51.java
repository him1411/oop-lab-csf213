import java.io.*;
import java.util.Scanner;

class lab51
{
	void adder(int v)
	{
		System.out.println("number 1");
	}
	void adder (float a,int b)
	{
		System.out.println("number 2");
	}
	void adder ()
	{
		System.out.println("number 3");
	}
	public static void main(String[] args)throws IOException 
	{
		String c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		c = (String)br.readLine();
		//System.out.println(c);
		adder(3);
		adder(3.0,5);
		adder();
	}
}