package DSA;

public class FrequcncyCount_SUingACII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="praveen";
		int[] arr=new int[256];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int ascii=ch;
			arr[ascii]++;
		}
		for(int i=0;i<256;i++)
	
		{
			if(arr[i]!=0)
			{
				System.out.println((char)i+""+arr[i]);
			}
		}

	}

}
