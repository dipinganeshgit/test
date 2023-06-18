package collection;

import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("Dipin");
		pq.add("Ammu");
		pq.add("Vihu");
		pq.add("Remani");
		pq.offer("Dilna");

		System.out.println(pq);

		
		PriorityQueue<Employee> pq1 = new PriorityQueue<Employee>();
		Employee e1 = new Employee(103, "Dipin");
		Employee e2 = new Employee(102, "Ammu");
		Employee e3 = new Employee(101, "Vihu");

		pq1.add(e1);
		pq1.add(e2);
		pq1.add(e3);
		
		for (Employee e	: pq1)
		{
			System.out.println(e.name);

		}
		

		
	}

}

class Employee implements Comparable<Employee>
{
	int id;
	String name;
	
	
	Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		
		return name.compareTo(o.name);
	}
}
