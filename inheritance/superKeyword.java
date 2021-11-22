/*
 * this is a example how to use inheritence to call parent class methods, constructor
 * Super keyword refers to the constructor of the superclass.
 *  super() -- will call non parameterized constructor of super classs
 *  super(arguments) -- will call parameterized constructor of super classs
 *  super.data_member --> to access data members by super keyword
 */

package inheritance;

class parentnew
{
	//super in variable instance example
	String color="White";
	
	//super in method instance example
	void currentJob()
	{
		System.out.println("Parent: Eating....");
	}
}
class childnew extends parentnew
{
	String color="black";
	void printcolor()
	{
		System.out.println(color);
		super.color="red";
		System.out.println(super.color);
	}
	
	//super in method instance example
	void currentJob()
	{
		System.out.println("Child: Walking....");
	}
	
	void work()
	{
		super.currentJob();
		currentJob();	
	}
}
public class superKeyword{
	public static void main(String args[])
	{
		childnew obj = new childnew();
		obj.work();
		obj.printcolor();
		
	}
}