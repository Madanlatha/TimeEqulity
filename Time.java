package time_to_equlity;

import java.util.Scanner;

public class Time {
	public static int TimeEquality(int arr[]) {
		int size=arr.length;
		int max=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<size;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		for(int i=0;i<size;i++) {
			sum =sum+(max-arr[i]);
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int value=TimeEquality(arr);
		System.out.println(value);
	}

}
