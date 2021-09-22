package pkg;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int biggest=arr[n-1];
		int j=n;
		int count=0;
		while(j-1>=0)
		{
			if(biggest==arr[j-1])
			{
				count++;
			}
			else if(biggest!=arr[j-1])
			{
				break;
			}
			j--;
		}
		System.out.println(count);
		sc.close();
	}
}