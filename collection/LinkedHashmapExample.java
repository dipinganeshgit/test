package collection;

import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> m1 = new LinkedHashMap<Integer, String>();
		m1.put(102, "Dipin");
		m1.put(100, "Ammu");
		m1.put(101, "Vihu");
		m1.put(null, null);
		m1.put(null, "Null String");
		
		for (Map.Entry x : m1.entrySet())
		{
			System.out.println(x.getValue());
		}
		
	}

}
