package sample;

import java.util.Scanner;

public class Countsort {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i;
		int n = sc.nextInt();
		int [] a=new int[n];
		for( i=0;i<n;i++);{
			a[i]=sc.nextInt();
		}
		countSort(a);
		System.out.println("Sorted array :");
		for (int element : a) {
	        System.out.print(element + " ");
		sc.close();
		}
	}
	private static void countSort(int[] a) {
		int max=findMax(a);
		int[] count=new int[max +1];
		for(int element :a) {
			count[element]++;
		}
		int i=0;
		for(int j=0;j<count.length;j++) {
			while(count[j]>0) {
				a[i++]=1;
				count[j]--;
			}
		}
	}
	private static int findMax(int[] a) {
	int max=Integer.MIN_VALUE;
	for(int element:a) {
		if(element>max) {
			max=element;
		}
	}
	return max;
	}

}
