package pkg;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		double positive=0,negative=0,zero=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>0)
			{
				positive++;
			}
			else if(arr[i]==0)
			{
				zero++;
			}
			else if(arr[i]<0)
			{
				negative++;
			}
		}
		System.out.println(String.format("%.6f", positive/n));
		System.out.println(String.format("%.6f", negative/n));
		System.out.println(String.format("%.6f", zero/n));
		sc.close();
	}
}