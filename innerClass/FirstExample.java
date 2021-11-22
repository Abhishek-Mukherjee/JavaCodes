package innerClass;
class outer{
	int x = 10;
	//------------------------------------------------
	class inner{
		//******INNER CLASS****************
		//inner class can access the outer class members without object as a global member;
		int y = 20;
		public void innerDisplay() {
			System.out.println("Inside Inner Class");
			System.out.println(x);
			System.out.println(y);
		}
	}
	//------------------------------------------------
	
	public void outerDisplay()
	{
		System.out.println("Inside outer Class");
		System.out.println(x);
		
	//  @@ Outer class cannot access of inner class without object.
	//	System.out.println(y);  
	//	innerDisplay();
		
		inner obj = new inner();
		obj.innerDisplay();
		System.out.println(obj.y);
	}
}
public class FirstExample {
	public static void main(String args[])
	{
		outer object = new outer();
		object.outerDisplay();
		
	//	object.innerDisplay() @@ will produce an error as inner member have to be used by inner class object only
		
		//## to create inner object from main method we have to first create the outer class object
		outer.inner objec2 = new outer().new inner();
//		objec2.innerDisplay();
	}
}
