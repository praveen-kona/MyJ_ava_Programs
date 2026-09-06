package Strings;
import java.util.*;
class Frequcnyof_Each_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="praveen";
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		System.out.println(map);

	}

}
