package RegularExpression;

public class Exmpl1 {
	public static void main(String args[])
	{
		/*
		 * 		. --> one any character[ Digit/char/special char]
		 * 
		 */
		String str1="a";
		String str2="2";
		String str3="@";
		String str4="";
		String str5="aa";
		
		System.out.println(str1.matches("."));
		System.out.println(str2.matches("."));
		System.out.println(str3.matches("."));
		System.out.println(str4.matches("."));
		System.out.println(str5.matches("."));
	}
}
