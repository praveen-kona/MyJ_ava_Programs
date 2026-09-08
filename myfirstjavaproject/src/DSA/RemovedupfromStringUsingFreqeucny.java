package DSA;

public class RemovedupfromStringUsingFreqeucny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		int[] count = new int[256];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(count[ch]==0)
			{
				System.out.println(ch);
			}
			count[ch]++;
		}
		

	}

}
