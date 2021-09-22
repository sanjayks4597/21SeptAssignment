package ClassesAndMethods;

import java.util.Scanner;

public class CapitalizeExceptSysmbols {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Characters:");
		String str=sc.nextLine();
		
		CapitalizeExceptSysmbols ces=new CapitalizeExceptSysmbols();
		ces.CheckSymbols(str);
		
		
		

	}
	
	public void CheckSymbols(String str) {
		
		char ch[] =str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isAlphabetic(ch[i]))
			{
				
				ch[i]=Character.toUpperCase(ch[i]);
			}
			else {
				ch[i]=ch[i];
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
		
	}

}
