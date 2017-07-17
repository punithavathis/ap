package guviprogram;

public class primeinterval {
	public static void main(String[] args){
		
	
	int i,j,k;
	for(i=4;i<80;i++) 
	{
	         k=0;
	         for(j=2;j<i;j++)
	         {
	                  if(i%j==0)
	                  k++;
	         }
	         if(k==0)
	         System.out.print(i+"   ");
	}
	}
}
