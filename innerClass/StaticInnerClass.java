package innerClass;

import innerClass.outerNonStatic.staticInner;

class outerNonStatic{
	static int x=10;
	int y=20;
	static class staticInner{
		public void display()
		{
			System.out.println(x);
			//System.out.println(y); static inner class can only access static member of outer class
		}
		public static void displayStatic()
		{
			System.out.println("Inside static method of static class staticInner");
		}
	}
}


public class StaticInnerClass {
	public static void main(String[] args) {
		outerNonStatic.staticInner obj = new outerNonStatic.staticInner();
		obj.display();
		staticInner.displayStatic();
	}
}
