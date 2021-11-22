package staticPrograms;
class StaticMethod{
	static int x=10;
	int y = 20;
	void test() {
		System.out.println("test method");
	}
	static void display()
	{
		System.out.println(x);
		//System.out.println(y); static variable can call only static members
		//test();	static variable can call only static methods
	}
}
public class Method {
	public static void main(String args[])
	{
		StaticMethod object = new StaticMethod();
		
		//static methods can be called using object or class_name
		object.display();
		StaticMethod.display();
	}
}
