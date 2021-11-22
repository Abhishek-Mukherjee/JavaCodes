package interfacePack;

interface AB{
	int x=10; //identifiers in interface are by default static and final
	public void meth1();
	//### PRIVATE METHOD
	//Private methods are used to be called inside a default method
	private void methodPrivate()	{ System.out.println("This is a PRIVATE method in AB interface");}
	
	//### STATIC METHOD
	public static void StaticMethod()   { System.out.println("Static Method AB interface"); }
	
	//### DEFAULT METHOD
	default void methodDefault() {
		System.out.println("This is a DEFAULT method in AB interface");
		methodPrivate();
	}
	
}

class CD implements AB{
	public void meth1() { System.out.println("CD class Meth1");	}
	
	public static void StaticMethod()   { System.out.println("Static Method cd interface"); }
}


public class DefaultAndPrivateInterface {
	public static void main(String args[])
	{
		AB obj1 = new CD();
		obj1.meth1();
		obj1.methodDefault();
		System.out.println(AB.x); //Static instance inside an interface
		AB.StaticMethod();	// Static method inside an inteface
		CD.StaticMethod();  
	//  obj1.methodPrivate();  WILL PRODUCE AN ERROR
		
		
	}
}
