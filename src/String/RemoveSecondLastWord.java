package String;

public class RemoveSecondLastWord {

	public static void main(String[] args) {
		
		String str = "This is a test string";
        System.out.println("Original String: " + str);
        System.out.println("String after removing second last word: " + removeSecondLastWord(str));
		
	}
	
	public static String removeSecondLastWord(String str) {
        String[] words = str.split(" ");
        if (words.length < 2) {
            return str; // If string has less than 2 words, return original string
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i != words.length - 2) { // Skip second last word
                sb.append(words[i]).append(" ");
            }
        }
        return sb.toString(); // Remove trailing space
    }

}
