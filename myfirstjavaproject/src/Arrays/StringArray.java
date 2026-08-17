package Arrays;

public class StringArray {

	public static void main(String[] args) {
		String[] names;  // Declaration
		names=new String[3];  //Creation
		names[0]="praveen";
		names[1]="vishnu";
		names[2]="nuthan";
		int count=0;
		
		//Representation or traversing
		
		for(int i=0;i<names.length;i++)
		{
			
			if(names[i].length() %2==0)
			{
				count++;
				System.out.println(names[i]);
				
			}
		}
		System.out.println("the given string array has " +count+ " even strings");
		

	}

}
