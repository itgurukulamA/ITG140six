import java.util.Scanner;
public class Studentrank {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter % subjects marks");
		int s1=obj.nextInt();
		int s2=obj.nextInt();
		int s3=obj.nextInt();
		int s4=obj.nextInt();
		int s5=obj.nextInt();
		if(s1>=35 && s2>=35 && s3>=35 && s4>=35 && s5>=35) {
			int tot=(s1+s2+s3+s4+s5)/5;
			if(tot>=90) {
				System.out.println("Rank A");
			}
			else if (tot>=80) {
				System.out.println("Rank B");
			}
			else if (tot>=70) {
				System.out.println("Rank C");
			}
			else if(tot>=60) {
				System.out.println("Rank D");
			}
			else if(tot>=60) {
				System.out.println("Rank E");
			}
			else {
				System.out.println("Rank F");
			}
		}
		else {
			System.out.println("You are failed in the exam");
		}
		
	}

}
