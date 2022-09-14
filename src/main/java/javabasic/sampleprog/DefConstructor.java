package javabasic.sampleprog;

public class DefConstructor {
	int age;
	String name;
	public DefConstructor()//Def-Constructor
	{
		System.out.println("My age is"+age);
		System.out.println("My name is"+name);
		System.out.println("Welcome to Def-Constructor");
	}
public static void main(String[] args)
{
	DefConstructor def=new DefConstructor();
}
}