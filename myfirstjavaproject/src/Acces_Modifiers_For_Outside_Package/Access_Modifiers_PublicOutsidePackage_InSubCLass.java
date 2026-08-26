package Acces_Modifiers_For_Outside_Package;
import AccessModifiers.Access_Specifier_Public;
public class Access_Modifiers_PublicOutsidePackage_InSubCLass  extends Access_Specifier_Public
{
	public Access_Modifiers_PublicOutsidePackage_InSubCLass(int roll ,int age)
	{
		super(roll);
	}
	public static void main(String[] args) {
		Access_Modifiers_PublicOutsidePackage_InSubCLass a1=new  Access_Modifiers_PublicOutsidePackage_InSubCLass(120,20);
        a1.test();
	}
	public void test()
	{
		System.out.println(roll);
		printRoll();
	}

}
