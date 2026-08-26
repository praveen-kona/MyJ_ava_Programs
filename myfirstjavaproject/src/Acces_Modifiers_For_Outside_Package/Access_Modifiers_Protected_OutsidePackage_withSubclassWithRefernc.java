package Acces_Modifiers_For_Outside_Package;
import AccessModifiers.Access_Modifiers_Protected;
public class Access_Modifiers_Protected_OutsidePackage_withSubclassWithRefernc extends Access_Modifiers_Protected
{
	Access_Modifiers_Protected_OutsidePackage_withSubclassWithRefernc(int roll,int age)
	{
		super(roll);
		System.out.println(age);
	}
	public void hell()
	{
		System.out.println(x);
	}
	public static void main(String[] args)
	{
		Access_Modifiers_Protected_OutsidePackage_withSubclassWithRefernc a1=new Access_Modifiers_Protected_OutsidePackage_withSubclassWithRefernc(20,30);
		a1.printRoll();
		a1.hell();
		System.out.println(a1.x);
	}

}
