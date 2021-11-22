package interfacePack;
import java.util.*;

interface member{
	public abstract void callback();
}

class customer implements member{
	String name;
	Scanner scan = new Scanner(System.in);
	
	customer()	{	
		System.out.println("Enter Name");
		this.name = scan.nextLine();	}
	
	public void callback() { System.out.println("Ok "+ name +"will be in the store");	}
	
}


class store
{
	member mem[] = new member[10];
	int i=0;
	
	public void registerMember(member M)
	{
		mem[i++]=M;
	}
	
	void inviteSale()
	{
		for(int count =0;count<i;count++)
		{
			mem[count].callback();
		}
	}
}

public class Example_Callback {
	public static void main(String args[])
	{
		member member1 = new customer();
		member member2 = new customer();
		store st = new store();
		st.registerMember(member1);
		st.registerMember(member2);
		st.inviteSale();
	}
}
