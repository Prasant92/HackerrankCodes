package pkg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CompareTriplets {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> al1=new ArrayList<Integer>(3);
		ArrayList<Integer> al2=new ArrayList<Integer>(3);
		int alice=0,bob=0;
		for(int i=0;i<3;i++)
		{
			int x=0;
			x=sc.nextInt();
			al1.add(x);
		}
		for(int j=0;j<3;j++)
		{
			int x=0;
			x=sc.nextInt();
			al2.add(x);
		}
		Iterator<Integer> itr1=al1.iterator();
		Iterator<Integer> itr2=al2.iterator();
		while(itr1.hasNext()||itr2.hasNext())
		{
			int x=itr1.next();
			int y=itr2.next();
			if(x<y)
			{
				bob++;
			}
			else if(x>y)
			{
				alice++;
			}
		}
		System.out.println(alice+" "+bob);
		sc.close();
	}
}