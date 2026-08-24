package OOPS;

class Encapsulation
{
	private int age;
	private String name;
	
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
		if(age>=0)
			this.age=age;
		
	}
	public void setName(String name)
	{
		this.name=name;
	}
}
public class Day1Task2_Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation d1=new Encapsulation();
		d1.setAge(-22);
		d1.setName("praveen");
		System.out.println(d1.getName()+" : "+d1.getAge());

	}

}
