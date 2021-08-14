import java.util.*;
public class Monthdays {
	public static void main(String  args[]) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("enter  the year");
		int n=obj.nextInt();
		System.out.println("enter the month");
		int m=obj.nextInt();
		int leap;
		if(n%400==0) {
			leap=0;
		}
		else if(n%100==0) {
			leap=1;
		}
		else if(n%4==0) {
			leap=0;
		}
		else {
			leap=1;
		}
		switch(m) {
		case 1:
			System.out.println("no of days:31");
			break;
		case 2:
			if(leap==0) {
				System.out.println("no of days:29");
				break;
			}
			
			else {
				System.out.println("no of days:28");
			}
			break;
		case 3:
			System.out.println("no of days:31");
			break;
		case 4:
			System.out.println("no of days:30");
			break;
		case 5:
			System.out.println("no of days:31");
			break;
		case 6:
			System.out.println("no of days:30");
			break;
		case 7:
			System.out.println("no of days:31");
			break;
		case 8:
			System.out.println("no of days:31");
			break;
		case 9:
			System.out.println("no of days:30");
			break;
		case 10:
			System.out.println("no of days:31");
			break;
		case 11:
			System.out.println("no of days:30");
			break;
		case 12:
			System.out.println("no of days:31");
			break;
		default:
			System.out.println("Invalid month entered");
		}
		
	}

}
