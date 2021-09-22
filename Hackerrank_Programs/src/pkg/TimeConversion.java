package pkg;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Integer h=Integer.parseInt(str.substring(0, 2));
		Integer m=Integer.parseInt(str.substring(3, 5));
		Integer s=Integer.parseInt(str.substring(6, 8));
		String a=str.substring(8, 10);
		if(a.equals("PM"))
		{
			if(h<12)
			{
				int hour=h+12;
				LocalTime t=LocalTime.of(hour, m, s);
				DateTimeFormatter df=DateTimeFormatter.ofPattern("HH:mm:ss");
				System.out.println(t.format(df));
			}
			else if(h==12)
			{
				LocalTime t=LocalTime.of(h, m, s);
				DateTimeFormatter df=DateTimeFormatter.ofPattern("hh:mm:ss");
				System.out.println(t.format(df));
			}
		}
		else if(a.equals("AM"))
		{
			if(h<12)
			{
				LocalTime t=LocalTime.of(h, m, s);
				DateTimeFormatter df=DateTimeFormatter.ofPattern("hh:mm:ss");
				System.out.println(t.format(df));
			}
			else if(h==12)
			{
				int hour=h-12;
				LocalTime t=LocalTime.of(hour, m, s);
				DateTimeFormatter df=DateTimeFormatter.ofPattern("HH:mm:ss");
				System.out.println(t.format(df));
			}
		}
		sc.close();
	}
}