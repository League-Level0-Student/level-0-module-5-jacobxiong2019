package _06_for_loop_gauntlet;

public class SingleForLoops {
public static void main(String[] args) {
		for(int i = 0; i < 101; i++)
		{
			System.out.println(i);
			
		}
		System.out.println("------------------");
		for(int i1 = 100; i1 > -1; i1--)
		{
			System.out.println(i1);
		}
		System.out.println("------------------");
		for(int i2 = 2; i2 < 101; i2++)
		{
			if(i2%2==0)
			System.out.println(i2);
		}
		System.out.println("------------------");
		for(int i3 = 1; i3 < 100; i3++)
		{
			if(i3%2==1)
			System.out.println(i3);
		}
		System.out.println("------------------");
		for(int i4 = 2; i4 < 501; i4++)
		{
			if(i4%2==0)
			System.out.println(i4 + " is even");
			else
			System.out.println(i4 + " is odd");
		}
		System.out.println("------------------");
		for(int i6 = 1; i6 < 778; i6++)
		{
			if(i6%7==0)
			System.out.println(i6);
		}
		System.out.println("------------------");
		int year = 2007;
		for(int i7 = 0; i7 < 14; i7++)
		
		{
			System.out.println("I was born in " + year + " and I was " + i7 + " years old.");
			year++;
		}
		System.out.println("------------------");
	}
}
