package String;

import java.util.Scanner;

public class PrintFirstLetterOfEachWord {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the whole string : ");
		String str=s.nextLine();
		
		String [] words=str.split(" ");
		for(String word:words) {
			
			System.out.print(word.charAt(0)+" ");
		}
	}

}
