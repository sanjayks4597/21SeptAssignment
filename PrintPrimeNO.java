package ClassesAndMethods;

public class PrintPrimeNO {

	public static void main(String[] args) {
		
		int min=15;
		int max=80;
		PrimeNo(min,max);
		
		

	}
	
	public static void PrimeNo(int min,int max) {
		
		int prime[]= {};
		boolean flag=false;
		
		for(int f=min;f<=max;f++)
		{
			for(int i=2;i<f;i++)
			{
				if(f%i==0)
				{
					
					flag=true;
					break;
					
				 
				}
				
			}
			if(flag==false)
			{
				for(int i=0;;i++)
				{
					prime[i]=f;
				}
			}
		}
		for(int x=0;x<prime.length;x++)
		{
			System.out.print(prime[x]);
		}
		
	}

}
