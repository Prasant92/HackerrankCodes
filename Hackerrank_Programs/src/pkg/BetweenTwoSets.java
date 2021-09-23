package pkg;

import java.util.ArrayList;
import java.util.Scanner;

public class BetweenTwoSets {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] arr_n=new int[n];
		int[] arr_m=new int[m];
		for(int i=0;i<n;i++)
		{
			arr_n[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			arr_m[i]=sc.nextInt();
		}
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		int i=arr_n[n-1];
		while(i<=arr_m[0])
		{
			int count1=0;
			for(int j:arr_n)
			{
				if(i%j==0)
				{
					count1++;
				}
			}
			if(count1==n)
			{
				al1.add(i);
			}
			i++;
		}
		ArrayList<Integer> al2=new ArrayList<Integer>();
		int k=arr_n[n-1];
		while(k<=arr_m[0])
		{
			int count2=0;
			for(int j:arr_m)
			{
				if(j%k==0)
				{
					count2++;
				}
			}
			if(count2==m)
			{
				al2.add(k);
			}
			k++;
		}
		System.out.println(al1);
		System.out.println(al2);
		int count=0;
		int a=0;
		while(a<al1.size())
		{
			int b=0;
			while(b<al2.size())
			{
				if(al2.get(b).equals(al1.get(a)))
				{
					count++;
				}
				b++;
			}
			a++;
		}
		System.out.println(count);
		sc.close();
	}
}