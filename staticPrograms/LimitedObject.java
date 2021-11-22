package staticPrograms;
class Objects{
	static int count=1;
	private Objects()
	{
		System.out.println("Object number: "+count++);
	}
	
	public static Objects getIstance()
	{
		if(count<=2) {
			Objects obj = new Objects();
			return obj;
		}
		else {
			return null;
		}
	}
}
public class LimitedObject {
	static void display(Objects obj)
	{
		if(obj==null) {
			System.out.println("Maximum Number of object created");
		}
		else
			System.out.println(obj);
	}
	public static void main(String args[])
	{
		Objects obj1 = Objects.getIstance();
		display(obj1);
		Objects obj2 = Objects.getIstance();
		display(obj2);
		Objects obj3 = Objects.getIstance();
		display(obj3);
		
		
	}
}
