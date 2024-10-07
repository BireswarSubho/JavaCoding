package Array;
import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int[] a= {3,5,8,1,0,6};
//		
//		for(int i=a.length-1;i>=0;i--) {
//			System.out.print(a[i]+" ");
//		}
		
		
		
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter size of an array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("Enter elements:"+" ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
