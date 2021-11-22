package inheritance;
class a{
	
		a()
		{
			System.out.println("Class a non-parameterized constructor");
		}
		a(String s)
		{
			System.out.println("Class a parameterized constructor : "+s);
		}
}
class b extends a{
	b()
	{
		System.out.println("Class b non-parameterized constructor");
	}
	b(String s)
	{
		System.out.println("Class b parameterized constructor : "+s);
	}
}
class c extends a{
	c()
	{
		super(); //this will call non-parameterized constructor of parent class
		System.out.println("Class c non-parameterized constructor");
		
	}
	c(String s)
	{
		super(s); //this will call parameterized constructor of parent class
		System.out.println("Class c parameterized constructor : "+s);
	}
}
public class Super {
	public static void main(String args[])
	{
		a obj1 = new a();
		System.out.println("");
		a obj2 = new a("Hello World");
		System.out.println("\n");
		System.out.println("\n");
		
//############################################################################################
		// here both object of class b will call non-parameterized constructor of class a
		b obj3 = new b();
		System.out.println("");
		b obj4 = new b("Hello World");
		System.out.println("\n");
//*********************************************************************************************
		
//############################################################################################
		c obj5 = new c();
		System.out.println("");
		c obj6 = new c("Hello World");
		System.out.println("\n");
//*********************************************************************************************
	}
}
