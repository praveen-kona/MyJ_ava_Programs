package Assignment;
class Developer implements Attendance
{

	@Override
	public void markAttendance() {
		// TODO Auto-generated method stub
		System.out.println("Developer Attendance : present");
		
	}
	
}
class Tester implements Attendance
{

	@Override
	public void markAttendance() {
		// TODO Auto-generated method stub
		System.out.println("Tester Attendance : present");
	}
	
}
class Manager implements Attendance
{

	@Override
	public void markAttendance() {
		// TODO Auto-generated method stub
		System.out.println("Manager Attendance : present");
	}
	
}
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Attendance a;
		a=new Developer();
		a.markAttendance();
		
		a=new Tester();
		a.markAttendance();
		
		a=new Manager();
		a.markAttendance();

	}

}
