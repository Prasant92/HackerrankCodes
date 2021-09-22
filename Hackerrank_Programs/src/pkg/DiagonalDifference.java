package pkg;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		int d1=0;
		int d2=0;
		int diff=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					System.out.println(arr[i][j]);
					d1=d1+arr[i][j];
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i+j)==n-1)
				{
					System.out.println(arr[i][j]);
					d2=d2+arr[i][j];
				}
			}
		}
		System.out.println(d2+" "+d1);
		diff=Math.abs(d2-d1);
		System.out.println(diff);
		sc.close();
	}
}