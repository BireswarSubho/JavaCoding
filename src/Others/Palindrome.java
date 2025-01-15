package Others;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=s.nextInt();
		int org=num;
		int rev=0;
		while(num!=0) {
			int digit=num%10;
			 rev=rev*10+digit;
			num=num/10;
		}
		System.out.println(rev);
		
		if(org==rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
	}

}
