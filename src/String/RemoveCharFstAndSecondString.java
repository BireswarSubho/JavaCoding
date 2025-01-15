package String;

public class RemoveCharFstAndSecondString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="hello";
		String str2="low";
		System.out.println(removeCharacter(str1,str2));
		
	}
	
	public static String removeCharacter(String str1,String str2) {
		StringBuilder result=new StringBuilder();
		for(char c:str1.toCharArray()) {
			if(!str2.contains(String.valueOf(c))) {
				result.append(c);
			}
		}
		
		return result.toString();
	}

}
