package Constructors;
class Employee {

    String name;
    int salary;
    String department;

    Employee() 
    {
        name = "Unknown!";
        salary = 0;
        department = "Not Assigned";
    }

    Employee(String name) {
        this();
        this.name = name;
    }

    Employee(String name, int salary, String department) {
        this();
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}
public class Constructor_Intialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("Praveen", 50000, "IT");
		e.display();

	}

}
