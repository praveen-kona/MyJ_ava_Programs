package ArraysandStrings;

public class FirstRepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="cat";
		boolean isfound=false;
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(s.charAt(i));
				isfound=true;
				break;
			}
				
		}
		if(!isfound)
		{
			System.out.println("not found");
		}

	}

}
