package finalPrograms;

class finalVariableTest{
	static final int W;
	final int X=10;
	final int Y;
	final int Z;
	
	static{
		//inside static block
		W=5;
	}
	
	{
		//inside instance Block
		Y=20;
	}
	
	finalVariableTest()
	{
		//inside constructor
		Z=30;
	}
	
	public void display()
	{
		final int x; //this is different to the above variable
		x=123;
		System.out.println("Diplay method : X="+x);
	}
}
public class FinalVariable {
	public static void main(String args[])
	{
		finalVariableTest obj = new finalVariableTest();
		obj.display();
		System.out.println(finalVariableTest.W+" "+obj.X+" "+obj.Y+" "+obj.Z);
	}
}
