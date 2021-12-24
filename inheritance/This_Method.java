package inheritance;
class ABCD{
	ABCD(){
		System.out.println("This is parent");
	}
}

class EFGH extends ABCD{
	EFGH(int x)
	{
		//	this(arg) will call the current class constructor but before executing the constructor it will 
		//invoke parent class constructor
		System.out.println("this(arg) method invokes me.. and yes it passes the value -> "+x);
	}
	EFGH(){
		this(3);
		System.out.println("Hello You are in child class Method");
	}
}
public class This_Method {
	public static void main(String args[])
	{
		EFGH obj = new EFGH();
	}
}
