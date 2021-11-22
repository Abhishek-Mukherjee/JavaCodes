package finalPrograms;

class finalVariableTest{
	static final int W;
	final int X=10;
	final int Y;
	final int Z;
	
	static{
		W=5;
	}
	
	{
		Y=20;
	}
	
	finalVariableTest()
	{
		Z=30;
	}
	
	public void display()
	{
		final int x;
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
