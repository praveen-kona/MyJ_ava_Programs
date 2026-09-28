package ArraysandStrings;

public class RevEachWord2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java is powerful";
		String[] str=s.split(" ");
		String res="";
		for(int i=0;i<str.length;i++)
		{
			String rev="";
			for(int j=str[i].length()-1;j>=0;j--)
			{
				rev+=str[i].charAt(j);
			}
			res+=rev+" ";
		}
		System.out.println(res);

	}

}
