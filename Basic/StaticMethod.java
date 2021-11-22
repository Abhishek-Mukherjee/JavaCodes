package Basic;

public class StaticMethod {
	public void func1()
	{
		System.out.println("In function 1");
	}
	public static void func2()
	{
		StaticMethod obj = new StaticMethod();
		System.out.println("In function 2");
		//func1(); this statement will produce error as func1 is not a static method that is why it need a object
		//			of the class to call
		obj.func1();
	}
	public static void main(String args[])
	{
		func2(); // main and func2 is a static method 
	}
}
