package DayProgress;
class Student
{
	String name;
	int age;
	void setDetails(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.println("Name :"+this.name);
		System.out.println("Age :"+this.age);
	}
}
public class Day5Task7 {

	public static void main(String[] args) {
		Student s=new Student();
		s.setDetails("praveen", 21);
		s.display();

	}

}
