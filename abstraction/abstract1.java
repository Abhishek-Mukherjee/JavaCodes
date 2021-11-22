package abstraction;


abstract class mobile
{
	//Constructor abstraction is not possible
	//abstract mobile();
	  abstract void call(); // abstract method
	  abstract void call2();
	void massage()
	{
		System.out.println("Texting....");
	}
}
abstract class samsung extends mobile
{
	// as it override all the abstract methods it becomes an concrete class
	 void call()
	{
		System.out.println("Calling.....");
	}
}
class latest extends samsung{
	 void call2()
	{
		System.out.println("Calling 2");
	}
}
public class abstract1 {
	public static void main(String args[])
	{
		// mobile object = new mobile // object of abstract class cannot be created 	
		mobile obj = new latest();
		obj.call();
		obj.call2();
		obj.massage();
		// mobile obj1 = new samsung(); ---> is not possible as it is not a concreat class.
	}
}
