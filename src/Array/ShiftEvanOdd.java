package Array;

public class ShiftEvanOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {5,4,9,10,6,7,3};
		int l=0;
		int r=arr.length-1;
		
		while(l<r) {
			while(arr[l]%2==0 && l<r)
				l++;
			while(arr[r]%2==1 && l<r)
				r--;
			if(l<r) {
				int temp=arr[l];
				arr[l]=arr[r];
				arr[r]=temp;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
