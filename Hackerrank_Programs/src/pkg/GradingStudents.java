package pkg;

import java.util.Scanner;

public class GradingStudents {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int[] arr=new int[x];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int j=0;
		while(j<arr.length)
		{
			int grade=0;
			int rem=arr[j]%5;
			int actual_rem=5-rem;
			if(arr[j]>=38)
			{
				if(actual_rem<3)
				{
					grade=arr[j]+actual_rem;
					System.out.println(grade);
				}
				else if(actual_rem>=3)
				{
					System.out.println(arr[j]);
				}
			}
			else if(arr[j]%5>=3||arr[j]<38)
			{
				System.out.println(arr[j]);
			}
			j++;
		}
		sc.close();
	}
}
