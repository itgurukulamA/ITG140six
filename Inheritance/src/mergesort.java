import java.util.*;
class mergesort{
	void merge(int []b ,int i,int j,int mid) {
		int arr1[]=new int[mid+2];
		int arr2[]=new int[j+2];
		int p=i;
		int q=mid+1;
		int st=i;
		while(p<=mid) {
			arr1[p]=b[p];
			p++;
		}
		while(q<=j) {
			arr2[q]=b[q];
			q++;
		}
		p=i;
		q=mid+1;
		while(p<=mid && q<=j) {
			if(arr1[p]<arr2[q]) {
				b[i]=arr1[p];
				p++;i++;
			}
			else {
				b[i]=arr2[q];
				i++;q++;
			}
		}
		while(p<q) {
			b[i]=arr1[p];
			p++;
			i++;
			
		}
		while(q<=j) {
			b[i]=arr2[p];
			p++;
			i++;
		}
		
	}
	void mergesort1(int[] b,int i,int j) {
		if(i<j) {
			int mid=(i+j)/2;
			mergesort1(b,i,mid);
			mergesort1(b,mid+1,j);
			merge(b,i,mid,j);
		}
	}
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Eter no of elements to store in array");
		int a=obj.nextInt();
		int b[]=new int[a];
		for(int i=0;i<a;i++) {
			b[i]=obj.nextInt();
		}
		mergesort obj1=new mergesort();
		obj1.mergesort1(b,0,a);
		for(int i=0;i<a;i++) {
			System.out.println(b[i]);
		}
		
	}
}