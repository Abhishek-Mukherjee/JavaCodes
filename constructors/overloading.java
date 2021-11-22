package constructors;

class A{
	A()
	{
		System.out.println("In A constructor");
	}
	A(String A)
	{
		System.out.println("In A constructor "+A);
	}
}
public class overloading {
	public static void main(String args[])
	{
		A obj = new A();
		A obj1 = new A("Hello World");
	}
}
