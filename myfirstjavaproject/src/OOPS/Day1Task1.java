package OOPS;

class Student 
{
    String name;
    int age;

    void display() 
    {
        System.out.println(name);
        System.out.println(age);
    }

    static void collegeName() 
    {
        System.out.println("ABC College");
    }
}
public class Day1Task1 {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="praveen";
		s1.age=22;
		s1.display();
		Student.collegeName();
		
		// TODO Auto-generated method stub
		/*
		 class Student {
    String name;
    int age;

    void display() {
        System.out.println(name);
        System.out.println(age);
    }

    static void collegeName() {
        System.out.println("ABC College");
    }

    public static void main(String[] args) {

        // Create Student object
        // Set name and age
        // Call display()

        // Call collegeName() without object
    }
}
		 */

	}

}
