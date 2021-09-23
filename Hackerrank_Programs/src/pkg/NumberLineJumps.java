package pkg;

import java.util.Scanner;

public class NumberLineJumps {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int v1=sc.nextInt();
		int x2=sc.nextInt();
		int v2=sc.nextInt();
		if(v2<v1 && x2>x1)
	    {
	        if((x1-x2)%(v2-v1)==0)
	        {
	            System.out.println("YES");
	        }
	        else
	        {
	            System.out.println("NO");
	        }
	    }
	    else
	    {
	        System.out.println("NO");
	    }

	    sc.close();
	}
}