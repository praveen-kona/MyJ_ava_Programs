package Interfaces;
interface A
{
	void login();
}
interface B 
{
	void logout();
}
public interface D extends A,B{

	void dashboard();
}
