package String;

import java.util.Scanner;

public class DuplicateElementsInString {

	public static void main(String[] args) {
	
		String sentence="I am law i Am";
		String[] words=sentence.split(" ");
		
		boolean status=false;
		for(int i=0;i<words.length;i++)
		{
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equalsIgnoreCase(words[j]))
				{
					System.out.println("Duplicates elements are : "+words[i]);
					status=true;
				}
			}
		}
		if(status==false)
			System.out.println("Duplicates elements not found");
	}

}
