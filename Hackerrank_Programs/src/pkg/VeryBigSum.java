package pkg;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class VeryBigSum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		ArrayList<BigInteger> al=new ArrayList<BigInteger>(x);
		BigInteger bi_sum=BigInteger.ZERO;
		for(int i=0;i<x;i++)
		{
			BigInteger bi=sc.nextBigInteger();
			al.add(bi);
		}
		Iterator<BigInteger> itr=al.iterator();
		while(itr.hasNext())
		{
			bi_sum=bi_sum.add(itr.next());
		}
		
		System.out.println(bi_sum);
		sc.close();
	}
}