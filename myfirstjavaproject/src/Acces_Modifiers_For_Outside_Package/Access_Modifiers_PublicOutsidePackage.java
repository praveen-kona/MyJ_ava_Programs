package Acces_Modifiers_For_Outside_Package;

import AccessModifiers.Access_Specifier_Public;


public class Access_Modifiers_PublicOutsidePackage {

	public static void main(String[] args) {
		Access_Specifier_Public a1=new Access_Specifier_Public(120);
		System.out.println(a1.roll);
		a1.printRoll();
	}

}
