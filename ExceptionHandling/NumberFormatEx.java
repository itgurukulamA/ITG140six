package ExceptionHandling;

public class NumberFormatEx {

	public static void main(String[] args) {
	try {
		String s="miracle";
		int i=Integer.parseInt(s);
		System.out.println(i);
	}
	catch(NumberFormatException e)
	{
		System.out.println(e);
	}
	}

}
