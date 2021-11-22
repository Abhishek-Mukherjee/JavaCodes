package constructors;


class student
{
	private
	int marks;
	int roll;
	public
	void setMarks(int x)
	{
		marks=x;
		System.out.println("\nRoll Number = "+getRoll()+" Marks changed");
	}	
	int getMarks()
	{
		return marks;
	}	
	int getRoll()
	{
		return roll;
	}

//***** constructor with constructor overloading *****
	student(int roll)
	{
		marks=0;
		this.roll=roll;
	}
	student(int roll, int marks)
	{
		this.roll=roll;
		this.marks=marks;
	}
//***************************************************

	void display()
	{
		System.out.println("Roll number: "+getRoll()+" Marks: "+getMarks());
	}

}
public class Constructor1 {
	public static void main(String args[])
	{
		student obj1 = new student(10);
		student obj2 = new student(11);
		student obj3 = new student(12,60);
		obj1.display();
		obj2.display();
		obj3.display();
		obj2.setMarks(50);
		obj2.display();
	}
}
