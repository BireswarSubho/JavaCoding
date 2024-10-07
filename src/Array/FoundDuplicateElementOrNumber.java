package Array;

public class FoundDuplicateElementOrNumber {

	public static void main(String[] args) {
		
//		String[] elements= {"java","c","python","c#","python","c"};
//		boolean status=false;
//
//		for(int i=0;i<elements.length;i++) {
//			for(int j=i+1;j<elements.length;j++) {
//				if(elements[i]==elements[j]) {
//					status=true;
//					System.out.println("Duplicate element is : "+elements[i]);
//					break;
//				}
//			}
//		}
//		
//		if(status==false) {
//			System.out.println("Elements are not found");
//		}
//		
		
		/////////////////////////////////////////////////////////////////////////
		
		
		int[] numbers= {14,8,10,5,14,16,8};
		boolean status1=false;

		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]==numbers[j]) {
					status1=true;
					System.out.println("Duplicate number is : "+numbers[i]);
					break;
				}
			}
		}
		
		if(status1==false) {
			System.out.println("numbers are not found");
		}
	}

}
