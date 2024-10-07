package Array;

public class MaxAndMinOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] numbers= {-7,9,14,89,-80};
		int min=numbers[0];
		int max=numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			
			if(numbers[i]>max) {
				max=numbers[i];
			}
			else if(numbers[i]<min) {
				min=numbers[i];
			}
		}
		
		System.out.println("largest is : "+max);
		System.out.println("Smallest is : "+min);
			}

}
