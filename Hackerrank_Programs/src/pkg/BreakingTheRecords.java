package pkg;

import java.util.Scanner;

public class BreakingTheRecords {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int[] arr=new int[x];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int lowest=arr[0];
		int highest=arr[0];
		int l=0,h=0;
		int i=1;
		while(i<arr.length)
		{
			if(lowest>arr[i])
			{
				lowest=arr[i];
				System.out.println(lowest);
				l++;
			}
			else if(highest<arr[i])
			{
				highest=arr[i];
				System.out.println(highest);
				h++;
			}
			i++;
		}
		System.out.println(h+" "+l);
		sc.close();
	}
}