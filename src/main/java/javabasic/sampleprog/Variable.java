package javabasic.sampleprog;

public class Variable 
{
	
	public void task()
	{
		char class1='A';///local variable
		System.out.println(class1);
	}
	
	public static void main(String[] args) 
	{
		Variable obj=new Variable();//Object creation
		obj.task();
	}

}
