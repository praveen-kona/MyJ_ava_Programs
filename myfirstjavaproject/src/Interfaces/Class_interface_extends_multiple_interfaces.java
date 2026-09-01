package Interfaces;

public class Class_interface_extends_multiple_interfaces  implements D{
	public void login()
	{
		System.out.println("Login");
	}
	public void logout()
	{
		System.out.println("Logout");
	}
	public void dashboard()
	{
		System.out.println("Dashboard");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_interface_extends_multiple_interfaces c=new Class_interface_extends_multiple_interfaces();
		c.login();
		c.logout();
		c.dashboard();

	}

}
