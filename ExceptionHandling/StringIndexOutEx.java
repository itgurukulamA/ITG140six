package ExceptionHandling;

public class StringIndexOutEx {
public static void main(String args[])
{
	try {
		String s="Miracle";
		System.out.println(s.charAt(10));
	}
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
}
}
