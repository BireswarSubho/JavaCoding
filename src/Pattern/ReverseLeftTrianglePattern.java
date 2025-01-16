package Pattern;

import java.util.Scanner;

public class ReverseLeftTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter row number : ");
		int row=s.nextInt();
		
		for(int i=row;i>=1;i--) {
			for(int j=row;j>i;j--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
