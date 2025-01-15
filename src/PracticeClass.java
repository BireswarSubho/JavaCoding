import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PracticeClass {

	public static void main(String[] args) {
		
		String str1="hello world";
		String str2="low";
		
		StringBuilder result=new StringBuilder();
		char[] chars=str1.toCharArray();
		for(char ch:chars)
		{
			if(!str2.contains(String.valueOf(ch))) {
				result.append(ch);
			}
		}
		System.out.println(result);
	}
}




