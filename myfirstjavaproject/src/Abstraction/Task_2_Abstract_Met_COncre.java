package Abstraction;
abstract class Employee
{
	abstract void work();
	
	void login()
	{
		System.out.println("Employee logged in");
	}
}
class Developer extends Employee
{
	@Override
	public void work() {
		System.out.println("Developer is coding");
	}
	@Override
	public void login()
	{
		System.out.println("Im override or implemtmentin again or reused");
	}
}
public class Task_2_Abstract_Met_COncre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer d=new Developer();
		d.work();
		d.login();

	}

}
