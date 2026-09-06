package DSA;

public class Frequcny_count_upper_Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="PRAAVeen";
		int[] arr=new int[256];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int ascii=ch;
			if(Character.isUpperCase(ch))
			{
				arr[ascii]++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				System.out.println((char)i+" "+arr[i]);
			}
		}

	}

}
