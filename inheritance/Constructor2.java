package inheritance;
class class1  // parent class
{
	private
	int sum;
	public
	int x;
	class1()  //non-parameterized constructor
	{
		System.out.println("In class1 non-parameterized constructor");
	}
	class1(int x) //parameterized constructor
	{
		System.out.println("In class1 parameterized constructor "+x);
	}
	void displayx()
	{
		System.out.println("Value of x = "+x);
	}
}
class class2 extends class1 // child class
{
	int y;
	void changeClass1X()
	{
		//data member are also available in subclass
		//but access is depends on the access modifier
		System.out.println("\nX value of super class changed");
		//sum=100;  gives error as sum is private data member
		x=100;
	}
	class2()	//non-parameterized constructor
	{
		System.out.println("In class2 non-parameterized constructor");
	}
	class2(int y)	//parameterized constructor
	{
		System.out.println("In class2 parameterized constructor "+y);
	}
}
public class Constructor2 {
 public static void main(String args[])
 {
 //******super class object created******
	 System.out.println("Super Class\n");
	 class1 obj1 = new class1();
	 System.out.println("\n");
	 class1 obj2 = new class1(10);
//***************************************
	 System.out.println("\n\n");
	 
	 
//******sub class object created******
	 //both the parameterized and non-parameterized constructor will call
	 // the non-parameterized constructor of super class
	 // to call specific constructor we have to call super() with specific arguments
	 // in side subclass constructor
	 System.out.println("Sub Class\n");
	 class2 obj3 = new class2();
	 System.out.println("\n");
	 class2 obj4 = new class2(10);
	 obj3.changeClass1X();
	 obj3.displayx();
//***************************************
 }
}
