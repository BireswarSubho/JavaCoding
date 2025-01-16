package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingNumberArray {

	public static void main(String[] args) {
		
		int[] nums= {4,7,8,9,13};
		int n=14;
		
		findMissingNumbers(nums,n);
		
	}
	
	public static void findMissingNumbers(int[] nums, int n) {
		
Set<Integer> numSet=new HashSet<Integer>();
		
		for(int num:nums) {
			numSet.add(num);
		}
		
		List<Integer> missNumber=new ArrayList<Integer>();
		for(int i=1;i<=n;i++) {
			if(!numSet.contains(i)) {
				missNumber.add(i);
			}
		}
		System.out.println("Missing numbers are : "+missNumber);
		System.out.println("Second missing number is :"+missNumber.get(2));
	}

}
