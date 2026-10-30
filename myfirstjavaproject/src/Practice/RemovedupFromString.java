package Practice;

public class RemovedupFromString {

	public static void main(String[] args) {
		String s="helllo";
		int[] count=new int [256];
		for(int i=0;i<s.length();i++)
		{
			if(count[s.charAt(i)]==0)
			{
				System.out.println(s.charAt(i));
			}
			count[s.charAt(i)]++;
		}
	}

}
