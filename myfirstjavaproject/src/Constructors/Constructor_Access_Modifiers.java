package Constructors;
class Test {

    
}
public class Constructor_Access_Modifiers 
{
	private Constructor_Access_Modifiers() {
        System.out.println("Private");
    }

	Constructor_Access_Modifiers(int a) {
        System.out.println("Default");
    }

    protected Constructor_Access_Modifiers(double a) {
        System.out.println("Protected");
    }

    public Constructor_Access_Modifiers(String s) {
        System.out.println("Public");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_Access_Modifiers t=new Constructor_Access_Modifiers();
		Constructor_Access_Modifiers t2=new Constructor_Access_Modifiers(10);
		Constructor_Access_Modifiers t3=new Constructor_Access_Modifiers(20.0);
		Constructor_Access_Modifiers t4=new Constructor_Access_Modifiers("hello");

	}

}
