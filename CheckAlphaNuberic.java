package ClassesAndMethods;

import java.util.Scanner;

public class CheckAlphaNuberic {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your String: ");
		String str=sc.nextLine();
		boolean flag=false;
		
		char ch[]=str.toCharArray();
		boolean indication=AlphaNumbericCheck(ch,str,flag);
		
		if(indication==true)
		{
			System.out.println("Your Entered string is alpha-numbaric");
		}
		else {
			System.out.println("Your Entered string is not a alpha-numbaric");
		}

	}
	
	public static boolean AlphaNumbericCheck(char c[],String st,boolean flag) {
		for(int i=0;i<st.length();i++)
		{
			if(Character.isDigit(c[i]))
			{
				flag=true;
				
			}
			
		}
		return flag;
	}

}
