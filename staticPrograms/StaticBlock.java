package staticPrograms;
class test{
	static {
		System.out.println("Static block 1");
	}
	static {
		System.out.println("Static block 2");
	}
}
public class StaticBlock {
	public static void main(String args[])
	{
		test obj = new test();
		System.out.println("Main");
	}
}
