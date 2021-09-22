package pkg;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		BigInteger[] arr=new BigInteger[5];
		for(int i=0;i<arr.length;i++)
		{
			BigInteger bi=BigInteger.ZERO;
			bi=sc.nextBigInteger();
			arr[i]=bi;
		}
		Arrays.sort(arr);
		BigInteger bi_totmax=BigInteger.ZERO;
		BigInteger bi_totmin=BigInteger.ZERO;
		int j=1;
		while(j<arr.length)
		{
			bi_totmax=bi_totmax.add(arr[j]);
			j++;
		}
		int k=0;
		while(k<arr.length-1)
		{
			bi_totmin=bi_totmin.add(arr[k]);
			k++;
		}
		System.out.println(bi_totmin+" "+bi_totmax);
		sc.close();
	}
}
