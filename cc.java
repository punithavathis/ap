package guviprogram;

public class cc {
	public static void main(String[] args){
		
	 for (int j = 0; j < 10; j++)
	    {
	        for (int i = 1; i <= 9; i++)
	        {
	            int c = j * 10 + i;
	            if (c % 2==0)
	                System.out.print(c + " " );
	        }
	        System.out.println();
	    }
	}
}