package ss;

public class oddinterval {
public static void main(String[] args){
	int i,flag,low=0,high=0;
	System.out.println("enter the two intervals:");
	while (low < high)
    {
        flag = 0;

        for(i = 2; i <= low/2; ++i)
        {
            if(low % i == 0)
            {
                flag = 1;
                break;
            }
        }

        if (flag == 0)
           System.out.println("low");

        ++low;
    }
System.out.println("prime numbers are:");
 
}
}

