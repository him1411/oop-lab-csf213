import java.io.*;
import java.util.Scanner;

class test
{
	void add(int v)
	{
		System.out.println("number 1");
	}
	void add (float a)
	{
		System.out.println("number 2");
	}
	void add ()
	{
		System.out.println("number 3");
	}
}

class lab52
{
	public static void main(String[] args) 
	{
		test abc = new test();
		abc.add();
		abc.add(3);
		abc.add(5);
	}
}
