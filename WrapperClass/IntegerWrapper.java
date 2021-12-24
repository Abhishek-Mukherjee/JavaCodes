package WrapperClass;

public class IntegerWrapper {
	public static void main(String args[])
	{
		Integer a = new Integer(1);
		Integer b=5;
		Integer c = Integer.valueOf(10);
		Integer d = Integer.valueOf("15");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
		int x=20;
		Integer xx=x; // this is called boxing
		System.out.println(xx);
		int y=xx.intValue(); // this is called unboxing
		System.out.println(y);
		
		System.out.println();
	}
}
