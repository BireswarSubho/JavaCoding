package Array;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a= {12,6,8,1,5,3,9};
		
		System.out.println("Array before sorting : "+Arrays.toString(a));
		
		int temp;
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		
		System.out.println("Array after sorting : "+Arrays.toString(a));
	}

}
