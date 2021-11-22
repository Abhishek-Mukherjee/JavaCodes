package constructors;
/*
 * 	Not possible
 * 	As contractors cannot be inherit
 */
class aa{
	aa()
	{
		System.out.println("in aaa");
	}
}
class bb extends aa{
//	aa()
//	{
//		System.out.println("in bb");
//	}
	void sip()
	{
		System.out.println("ok");
	}
}
public class overriding {
 public static void main(String args[])
 {
	 bb obj = new bb();
	// obj.aa(); //Contractors cannot be inherit so it cannot be over ride
 }
}
