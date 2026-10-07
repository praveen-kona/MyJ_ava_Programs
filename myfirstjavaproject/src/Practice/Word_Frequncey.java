package Practice;

public class Word_Frequncey {

	public static void main(String[] args) {

		String s = "java is easy java is good";
		
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			boolean isfound=false;
					for(int k=0;k<i;k++)
					{
						if(str[i].equals(str[k]))
						{
							isfound=true;
							break;
						}
					}
			if(isfound)
				continue;
			int count=0;
			for(int j=0;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					count++;
				}
			}
			System.out.println(str[i]+" "+count);
		}
	}

}
