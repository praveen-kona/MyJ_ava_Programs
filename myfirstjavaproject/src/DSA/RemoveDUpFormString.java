package DSA;

public class RemoveDUpFormString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="programming";
		char[] ch=s.toCharArray();
		char[] uniq=new char[ch.length];
		int u=0;
		for(int i=0;i<ch.length;i++)
		{
			boolean isfound=false;
			for(int j=0;j<u;j++)
			{
				if(ch[i]==uniq[j])
				{
					isfound=true;
					break;
				}
			}
			if(!isfound)
			{
				uniq[u]=ch[i];
				u++;
			}
		}
		for(int i=0;i<u;i++)
		{
			System.out.print(uniq[i]+" ");
		}

	}

}
