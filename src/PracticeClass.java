import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PracticeClass {

	public static void main(String[] args) {
		
		int[] numbers= {5,8,3};
		int min=numbers[0];
		int max=numbers[0];
		for(int number:numbers) {
			if(number<min) {
				min=number;
			}
			else if(number>max) {
				max=number;
			}
		}
		
		System.out.println("Min value is : "+min);
		System.out.println("Max value is : "+max);
		
	}
	

}




