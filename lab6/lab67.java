import java.io.*;

class student implements Serializable
{
	int roll;
	String name;
	double cg;
	student friend;
	student(int roll,String name,double cg,student friend)
	{
		this.roll = roll;
		this.name = name;
		this.cg = cg;
		this.friend = friend;
	}

	public String details()
	{
		return "roll" + roll + "\nname "+ name + "\ncg "+ cg ;
	}
}

public class lab67
{
	public static void main(String[] args) 
	{
		File outfile = new File("Files/new.dat");
		student abcd = new student(1,"abcd",34,null);
		student efgh = new student(2,"efgh",56,abcd);
		try
		{
			FileOutputStream fos = new FileOutputStream(outfile);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(abcd);
			oos.writeObject(efgh);
			System.out.println("Done");
			oos.close();
			fos.close();
		}
		catch(Exception e)
		{System.out.println(e);}

		try
		{
			File inFile = new File("Files/new.dat");
			FileInputStream fis = new FileInputStream(inFile);
			ObjectInputStream ois = new ObjectInputStream(fis);
			student temp;
			while((temp = (student)ois.readObject())!=null)
			{	System.out.println(temp);}
			ois.close();
			fis.close();
		}
		catch(EOFException ef)
		{}
		catch(Exception e)
		{	System.out.println(e);}
	}
}