package Others;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number : ");
		int n1=sc.nextInt();
		System.out.println("Enter second number : ");
		int n2=sc.nextInt();
		System.out.println("Enter range : ");
		int r=sc.nextInt();
		
		int sum=0;
		
		System.out.print(n1+" "+n2+" ");
		for(int i=2;i<=r;i++) {
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.print(sum+" ");
		}
		System.out.println(sum);
	}

}
