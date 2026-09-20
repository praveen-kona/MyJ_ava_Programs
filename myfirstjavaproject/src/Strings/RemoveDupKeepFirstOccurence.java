package Strings;

public class RemoveDupKeepFirstOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hell jav how are u!";
		int[] count=new int[256];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
					if(count[ch]==0)
					{
						System.out.print(ch);
						
					}
					count[ch]++;

		}

	}

}
