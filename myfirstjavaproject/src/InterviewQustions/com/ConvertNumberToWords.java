package InterviewQustions.com;

public class ConvertNumberToWords {

	public static void main(String[] args) {
		

		int n=10;
		String cn=convert(n);
		System.out.println(cn);
	}
	static String[] ones= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
	static String[] teens= {"Ten","Eleven","Tweleve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen"
			,"Eighteen","Ninteen"};
	static String[] tens= {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninty"};
	static String convert(int n)
	{
		String res="";
		if(n==0)
			return "zero";
		if(n>=10000000)
		{
			res+=convert(n/10000000)+" crore ";
			n%=10000000;
		}
		if(n>=100000)
		{
			res+=convert(n/100000)+" Lakhs ";
			
			n%=100000;
		}
		if(n>=1000)
		{
			res+=convert(n/1000)+" Thousand ";
			n%=1000;
		}
		if(n>=100)
		{
			res+=ones[n/100]+" Hundred ";
			n%=100;
		}
		if(n>=20)
		{
			res+=tens[n/10]+" ";
			n%=10;
		}
		if(n>=10)
		{
			res+=teens[n-10]+" ";
			n =0;
		}
		if(n>0)
		{
			res+=ones[n];
			
		}
		return res.trim();
		
	}

}
