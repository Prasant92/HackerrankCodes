package pkg;

import java.util.Scanner;

public class SubArrayDivision {

	public static void main(String[] args) {
		
		Scanner sc=null;
		int count=0;
		try {
			sc = new Scanner(System.in);
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
			int d=sc.nextInt();
			int m=sc.nextInt();
			int i=0;
			
			count = 0;
			int j=0;
			while(i<=arr.length)
			{
				j=i;
				int sum=0;
				while(j<m)
				{
					sum=sum+arr[j];
					j++;
				}
				if(sum==d)
				{
					count++;
				}
				System.out.println(sum+" "+j+" "+m+" "+i);
				m++;
				i++;
			}
		} catch (Exception e) {
			System.out.println(count);
		}
		sc.close();
	}
}