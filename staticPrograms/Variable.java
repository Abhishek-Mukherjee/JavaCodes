package staticPrograms;

public class Variable {
int x = 10;
static int y = 20;

	public static void main(String args[]) {
		Variable obj1 = new Variable();
		Variable obj2 = new Variable();
		obj1.x=100;
		obj2.x=200;
		System.out.println(obj1.x);
		System.out.println(obj2.x);
		
		
		//static variable shares same memory localtion in every object
		//static variable is metadata of class not object
		obj1.y=3;
		obj2.y=4;
		System.out.println(obj1.y);
		System.out.println(obj2.y);
		System.out.println(Variable.y); //static variable can be called using class name also;
	}
}
