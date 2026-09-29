package ArraysandStrings;

public class MostFrequentWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] banned= {};
		String s="a.";
		s=s.toLowerCase().replaceAll("[!',;?.]", " ");
		String[] str=s.split("\\s+");
		String mostfreq="";

		int max=0;
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
			boolean isbanned=false;
			for(int l=0;l<banned.length;l++)
			{
				if(str[i].equals(banned[l]))
				{
					isbanned=true;
					break;
				}
			}
			if(isbanned)
				continue;
			int count=0;
			for(int j=0;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					count++;
				}
			}
			if(count>max)
			{
				max=count;
				mostfreq=str[i];
			}
		}

		System.out.println(mostfreq);
	}

}
