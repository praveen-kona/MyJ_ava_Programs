package OOPS;

class Employee
{
	private String name;
	private double salary;
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	
	public void setName(String n)
	{
		this.name=n;
	}
	public void setSalary(double sal)
	{
		if(sal>=0)
		{
			this.salary=sal;
		}
		
	}
}
public class Day1Task3_Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();

		e.setName("Praveen");
		e.setSalary(50000);

		System.out.println(e.getName());
		System.out.println(e.getSalary());

		e.setSalary(-10000);

		System.out.println(e.getSalary());

	}

}
