package interfacePack;

interface A{
	public void meth1();
}

interface B extends A{
	public void meth2();
}

class C implements B{
	public void meth1() {
		System.out.println("Class c meth1");
	}
	
	public void meth2() {
		System.out.println("Class c meth2");
	}
	
	public void meth3() {
		System.out.println("Class c meth3");
	}
}
//*****************************************
//interface C implements A{
//  THIS IS AN ERROR AS INTERFACE CAN'T HOLD METHOD BODY AND IPLEMENTING AN INTERFACE MEANNS GIVING BODY
//	wHICH CREATES CONFLICT
//}
//******************************************
public class InterfaceExtendsInterface {

	public static void main(String args[])
	{
		A obj1 = new C();
		obj1.meth1();
	//	obj1.meth2();
	//  obj1.meth3();		Reference of A class knows only meth1() so this will gives error
		System.out.println("\n");
		B obj2 = new C();
		obj2.meth1();
		obj2.meth2();
		//obj2.meth3();
		System.out.println("\n");
		C obj3 = new C();
		obj3.meth1();
		obj3.meth2();
		obj3.meth3();
		
		
	}
}
