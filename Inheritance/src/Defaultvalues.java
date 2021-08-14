
public class Defaultvalues {
	static int value;
	static char c;
	static String s;
	static boolean b;
	static long l;
	static byte by;
	static short sh;
	static float f;
	static double d;
	static int[] a=new int[10];
	public static void main(String args[]) {
		System.out.println(value);
		System.out.println(c);
		System.out.println(s);
		System.out.println(b);
		System.out.println(l);
		System.out.println(by);
		System.out.println(sh);
		System.out.println(f);
		System.out.println(d);
		for(int i=0;i<10;i++) {
			System.out.println(a[i]);
		}
		
	}

}
