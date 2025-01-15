package String;

import java.util.HashMap;
import java.util.Map;

public class aabbbTOa2b3 {

	public static void main(String[] args) {
		
		String str="aabbb";
		Map<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) 
		{
			char ch=str.charAt(i);
			if(hm.containsKey(ch)) 
			{
				int count=hm.get(ch);
				count++;
				hm.replace(ch, count);
			}
			else
			{
				hm.put(ch, 1);
			}
		}
		
		for(Character key:hm.keySet())
		{
			System.out.print(key+""+hm.get(key));
		}

	}

}
