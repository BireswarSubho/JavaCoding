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
		
		int[] nums= {5,4,7,9,8,2,3,1};
		int l=0;
		int r=nums.length-1;
		while(l<r) {
			while(nums[l]%2==0 && l<r)
			{
				l++;
			}
			while(nums[r]%2==1 && l<r)
			{
				r--;
			}
			if(l<r) {
				int temp=nums[l];
				nums[l]=nums[r];
				nums[r]=temp;
			}
		}
		
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		
	}
	
}




