package ArraysandStrings;

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stubo
		String s="hello java";
		s=s.toLowerCase();
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
