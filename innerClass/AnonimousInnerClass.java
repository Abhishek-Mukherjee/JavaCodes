package innerClass;
abstract class testAbst{
	public abstract void abstractDisplay();
}

interface testInterface{
	public abstract void interfaceDisplay();
}


public class AnonimousInnerClass {
	testInterface objInter2 = new testInterface() 
	{
		public void interfaceDisplay(){System.out.println("Interface class object");}
	};
	public void display()
	{
		new testAbst() {public void abstractDisplay() {System.out.println("annonymus class and annoynimus object");	}}.abstractDisplay();
		testAbst objAb = new testAbst() 
		{
			public void abstractDisplay(){ System.out.println("Abstract Class object");}
		};
		testInterface objInter1 = new testInterface() 
		{
			public void interfaceDisplay(){System.out.println("Interface class object");}
		};
		
		objAb.abstractDisplay();
		objInter1.interfaceDisplay();
		objInter2.interfaceDisplay();
	}

	public static void main(String args[])
	{
		AnonimousInnerClass obj = new AnonimousInnerClass();
		System.out.println("Started..........");
		obj.display();
		
	}
}
