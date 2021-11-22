package innerClass;

public class LocalInnerClass {
	private int x = 10;

	// Method
	public void test() {
		System.out.println("Outer class test method");
	}

	public void display() {
		int y = 20;
		// innerClass inside a method
		class innerClass {
			void displayInner() {
				System.out.println("Inside Local Inner Class");
				System.out.println(x);
				System.out.println(y);
				test();
			}
		}
		innerClass obj1 = new innerClass();
		obj1.displayInner();
	}

	public static void main(String args[]) {

		LocalInnerClass obj = new LocalInnerClass();
		obj.display();
	}
}
