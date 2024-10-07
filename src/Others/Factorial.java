package Others;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		
		int fct=1;
		
		for(int i=1;i<=num;i++) {
			fct*=i;
		}
		System.out.println(fct);
	}

}
