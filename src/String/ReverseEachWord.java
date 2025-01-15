package String;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="java code";
		String[] words=input.split(" ");
		String output="";
		for(String word:words) {
			
			String revWord="";
			for(int i=word.length()-1;i>=0;i--){
					revWord=revWord+word.charAt(i);
		}
			 output=output+revWord+" ";
	}
		
		System.out.println(output);

}
}
