

import java.util.Scanner;

public class CommonChar {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String a="";
String b="";
String c="";
System.out.println("Enter two words:");
a = sc.nextLine();
b = sc.nextLine();
int d = a.length();
for(int i=0;i<d;i++) {
char ch = a.charAt(i);
if(b.indexOf(ch)!=-1) {
c=c+String.valueOf(ch);

}
}
System.out.println("Common lettes are:"+c);
}

}