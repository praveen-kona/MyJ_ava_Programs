package Eceptions;
import java.util.*;
public class MultipleCatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] arr= {10,20};
			System.out.println(arr[7]);
		} catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println(e1.toString());
			System.exit(0);
		}
		catch(NullPointerException e2)
		{
			System.out.println(Arrays.toString(e2.getStackTrace()));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		
		finally
		{
			System.out.println("hello note thsi point some times finally block also not exeute");
		}

	}

}
