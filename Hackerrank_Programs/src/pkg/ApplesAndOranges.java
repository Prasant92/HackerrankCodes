package pkg;

import java.util.Scanner;

public class ApplesAndOranges {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int t=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[] arr_apples=new int[m];
		int[] arr_oranges=new int[n];
		for(int i=0;i<arr_apples.length;i++)
		{
			arr_apples[i]=sc.nextInt();
		}
		for(int i=0;i<arr_oranges.length;i++)
		{
			arr_oranges[i]=sc.nextInt();
		}
		int count_apples=0,count_oranges=0;
		for(int j:arr_apples)
		{
			int distance=0;
			distance=a+j;
			if(s<=distance&&distance<=t)
			{
				count_apples++;
			}
		}
		for(int j:arr_oranges)
		{
			int distance=0;
			distance=b+j;
			if(s<=distance&&distance<=t)
			{
				count_oranges++;
			}
		}
		System.out.println(count_apples);
		System.out.println(count_oranges);
		sc.close();
	}
}