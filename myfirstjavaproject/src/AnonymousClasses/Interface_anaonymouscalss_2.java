package AnonymousClasses;
interface Vehicle {
    void start();
}
public class Interface_anaonymouscalss_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new Vehicle()
				{
			int x=10;
			@Override
			public void start()
			{
				System.out.println("Car starts");
				System.out.println(x);
			}
				};
				v.start();
				System.out.println("hell");

	}

}
