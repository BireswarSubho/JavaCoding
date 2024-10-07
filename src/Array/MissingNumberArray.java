package Array;

public class MissingNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr= {16,3,20,8,9,11};
		int m=Integer.MIN_VALUE;
		
		for(int i:arr) {
			if(i>m) {
				m=i;
			}
		}
		int[] temp=new int[m];
		for(int j:arr) {
			temp[j-1]=1;
		}
		for(int j=0;j<temp.length;j++) {
			if(temp[j]==0) {
				System.out.print(j+1+" ");
			}
			
		}
	}

}
