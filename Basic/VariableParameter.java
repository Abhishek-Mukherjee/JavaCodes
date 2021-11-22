package Basic;

public class VariableParameter {
// ##Variable arguments must be last argument.
	
	static void show(int ...A)
	{
		for(int x:A)
		{
			System.out.println(x);
		}
	}
	
	static void showString(String ...name){
		for(int i=0;i<name.length;i++)
		{
			System.out.println(i+1+". "+name[i]);
		}
	}
	public static void main(String args[])
	{
		show();
		show(10,20,30);
		show(new int[] {1,2,3,4,5});
		int arr[] = new int[4];
		arr[0]=12;
		arr[1]=13;
		arr[2]=14;
		arr[3]=15;
		show(arr);
		
		showString("Abhishek","Rony","Karna");
	}
}
