package collection;
import java.util.ArrayList;


public class ArrayListCOllection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Dipin");
		a1.add("Ammu");
		a1.add("Amma");
		a1.add("Vihu");
		a1.add("Guest");

		System.out.println(a1);
		
		for (String name: a1)
		{
			System.out.println(name);

		}
		
		a1.remove("Guest");
		System.out.println(a1);
		
		


	}

}
