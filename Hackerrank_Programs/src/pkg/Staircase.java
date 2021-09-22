package pkg;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		for(int i=1;i<=x;i++)
		{
			for(int j=x;j>=1;j--)
			{
				if(i<j)
				{
					System.out.print(" ");
				}
				else if(i>=j)
				{
					System.out.print("#");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
