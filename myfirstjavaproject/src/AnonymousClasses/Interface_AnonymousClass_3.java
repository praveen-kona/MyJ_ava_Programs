package AnonymousClasses;
interface Calculator {
    int add(int a, int b);
}
public class Interface_AnonymousClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator()
				{
			@Override
			public int add(int a,int b)
			{
				return a+b;
			}
				};
				System.out.println(c.add(10,20));

	}

}
