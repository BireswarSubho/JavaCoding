package Array;
import java.util.HashSet;

public class RemoveDuplicateElementOrNumber {

	public static void main(String[] args) {
		
		String[] elements= {"c","java","c","python","azure","xml","json","azure"};
		
		HashSet<String> hs=new HashSet<String>();
		 for(String element: elements) {
			 hs.add(element);
		 }
		 
		 for(String no:hs) {
			 System.out.print(no+" ");
		 }

	}

}
