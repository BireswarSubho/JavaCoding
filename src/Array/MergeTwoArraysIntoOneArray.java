package Array;

public class MergeTwoArraysIntoOneArray {

	public static void main(String[] args) {
		

		int[] a= {2,4,1};
		int[] b= {8,9,0};
		int l1=a.length;
		int l2=b.length;
		int l3=l1+l2;
		int[] c=new int[l3];
		
		for(int i=0;i<l1;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<l2;i++) {
			c[l1+i]=b[i];
		}
		for(int i=0;i<l3;i++) {
			System.out.print(c[i]+" ");
		}
	}

}
