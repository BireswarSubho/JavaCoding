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
		
		String str = "This is a test string";
        System.out.println("Original String: " + str);
        String[] words=str.split(" ");
       if(words.length<2) {
    	   System.out.println(str);
       }
       for(int i=0;i<words.length;i++) {
    	   
    	   StringBuilder sb=new StringBuilder();
    	   
    	   if(i!=words.length-2) {
    		   sb.append(words[i]).append(" ");
    		   
    	   }
    	   System.out.print(sb);
       }
       
       
		
	}
	
	 
}




