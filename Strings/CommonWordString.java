package Strings;

import java.util.HashSet;

public class CommonWordString 
{

 public static void main(String args[])
 {
	 String[] arr1={"hello","miracle","software"};
	 String[] arr2= {"hello","miracle","college"};
	HashSet<String> set=new HashSet<String>();
	for(int i=0;i<arr1.length;i++)
	{
		for(int j=0;j<arr2.length;j++)
		{
			if(arr1[i].equals(arr2[j]))
			{
				set.add(arr1[i]);
			}
		}
	}
	System.out.println(set);
 }
}
