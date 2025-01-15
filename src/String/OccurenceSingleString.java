package String;

import java.util.HashMap;
import java.util.Map;

public class OccurenceSingleString {

	public static void main(String[] args) {
		
		String input="helloo";
		Map<Character,Integer> hm=new HashMap<Character,Integer>();
		char[] chars=input.toCharArray();
		for(char ch: chars)
		{
			if(!hm.containsKey(ch)) {
				hm.put(ch, 1);
			}
			else {
				int value=hm.get(ch);
				hm.put(ch, value+1);
			}
		}
		
		System.out.println(hm);
		

	}

}
