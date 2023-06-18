package collection;

import java.util.Deque;
import java.util.ArrayDeque;

public class DequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String> pq = new ArrayDeque<String>();
		pq.add("Dipin");
		pq.add("Ammu");
		pq.add("Vihu");
		pq.add("Remani");
		pq.offer("New");
		pq.offerLast("Last");
		pq.offerFirst("Dilna");
		pq.offerFirst("Dilna1");

		System.out.println(pq);
		System.out.println(pq.peekLast());
		System.out.println(pq.peek());
		
		Deque<Employeee> pq1 = new ArrayDeque<Employeee>();
		Employeee e1 = new Employeee(103, "Dipin");
		Employeee e2 = new Employeee(102, "Ammu");
		Employeee e3 = new Employeee(101, "Vihu");

		pq1.add(e1);
		pq1.add(e2);
		pq1.offerFirst(e3);
		
		for (Employeee e	: pq1)
		{
			System.out.println(e.name);

		}

	}

}

class Employeee
{
	int id;
	String name;
	
	
	Employeee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

}