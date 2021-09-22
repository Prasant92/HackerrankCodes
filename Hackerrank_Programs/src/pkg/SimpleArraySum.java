package pkg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SimpleArraySum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>(size);
		int tot=0;
		for(int i=0;i<size;i++)	
		{
			int x=0;
			x=sc.nextInt();
			al.add(x);
		}
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext())
		{
			tot=tot+itr.next();
		}
		System.out.println(tot);
		sc.close();
	}
}