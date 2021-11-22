package inheritance;
class parent{
	parent()
	{
		System.out.println("Parent class constructor");
	}
}
class child extends parent{
	child()
	{
		System.out.println("Child class constructor");
	}
}
class grandchild extends child{
	grandchild()
	{
		System.out.println("Grandchild class constructor");
	}
}
public class Constructor1 {
 public static void main(String args[])
 {
	 //in inheritance the constructor of parent class will be executed first
	 parent p = new parent();
	 System.out.println("\n");
	 child c = new child();
	 System.out.println("\n");
	 grandchild g = new grandchild();
 }
}
