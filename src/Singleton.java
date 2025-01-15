
public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Abc obj1=Abc.getInstance();
		Abc obj2=Abc.getInstance();
		
	}

}


class Abc{
	
	static Abc ob=new Abc();
	private Abc()
	{
		
	}
	public static Abc getInstance()
	{
		return ob;
	}
}
