package Basic;
class test{
	private
		String name;
		int marks;
	public
		void setMarks(int marks)
		{
			System.out.println("\n"+getName()+" marks changed \nUpdated Result :--");
			
			this.marks=marks;
			displayGrade();
		}
		String getName()
		{
			return name;
		}
		int getMarks()
		{
			return marks;
		}
	test(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	
	void displayGrade()
	{
		System.out.println("Name: "+name);
		if(getMarks()>20)
		{
			System.out.println("Status: Pass  Marks: "+getMarks());
		}
		else
		{
			System.out.println("Status: Fail  Marks: "+getMarks());
		}
	}
}
public class ArrayOfObjects {
	public static void main(String args[])
	{
		test obj[] = new test[3];
		obj[0] = new test("Abhishek",50);
		obj[1] = new test("Ram",10);
		obj[2] = new test("Sham",90);
		obj[0].displayGrade();
		obj[1].displayGrade();
		obj[2].displayGrade();
		obj[1].setMarks(30);
	}
}
