package staticPrograms;

/*
 * 		1)		Make a private static class reference and intialize it with null
 * 		2)		Make constructor private
 * 		3)		Make a static public method which will create an object and initalize with
 * 				the class reference and return it
 * 		4)		We can call the method using class name and can get instance object
 */
class Coffie{
	private int coffie;
	private int suger;
	private int milk;
	private int water;
	
	private static Coffie coffieObject = null;
	
	private Coffie()
	{
		coffie=2;
		suger=1;
		milk=1;
		water=1;
	}
	
	public static Coffie getInstanceObject()
	{
		if(coffieObject==null)
			coffieObject = new Coffie();
		
		return coffieObject;	
	}

//	@Override
//	public String toString() {
//		return "Coffie [coffie=" + coffie + ", suger=" + suger + ", milk=" + milk + ", water=" + water + "]";
//	}
}

public class SingletonClass {
	public static void main(String args[])
	{
		Coffie obj1 = Coffie.getInstanceObject();
		System.out.println(obj1);
		Coffie obj2 = Coffie.getInstanceObject();
		System.out.println(obj2);
	}
}
