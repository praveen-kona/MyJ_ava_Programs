package Practice;
import java.util.*;
public class FrequcyCountHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> map=new HashMap<>();
		String s="PrAveen";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch)) {
				if(map.containsKey(ch))
			   {
				map.put(ch,map.get(ch)+1);
				
			}
			else
				map.put(ch,1);
		}
		}
		System.out.println(map);

	}

}
