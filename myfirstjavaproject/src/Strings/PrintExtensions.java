package Strings;

public class PrintExtensions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="pass.jpg";
		String s2="file.txt";
		String s3="photo.png";
		String rev="";
		
			int dot=s1.lastIndexOf('.');
			
		System.out.println(s1.substring(dot+1));//get everythingafter dot
	}

}
