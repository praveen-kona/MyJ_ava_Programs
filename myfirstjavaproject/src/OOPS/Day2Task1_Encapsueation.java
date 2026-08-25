package OOPS;

public class Day2Task1_Encapsueation
{
private int age;
public void setAge(int a)
{
	if(a>20)
		this.age=a;
	
}
public int getAge()
{
	return age;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day2Task1_Encapsueation d1=new Day2Task1_Encapsueation();
		d1.setAge(21);
		System.out.println(d1.getAge());

	}

}
