package guviprogram;
import java.util.*;
import java.io.*;
public class largenumber {

	    public static void main(String[] args)
	    {
	        System.out.println("ENTER THE NUMBER OF ELEMENTS");
	        Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	        String[] a=new String[n];
	        System.out.println("ENTER THE ELEMENTS");
	        for(int x=0;x<n;x++)
	        {
	         a[x]=s.next();
	        }
	        for(int k=0;k<a.length;k++)
	        {
	          String temp=a[k];
	          for(int i=0;i<a.length;i++)
	          {
	           String temp1=a[i];
	           for(int j=0;j==0;)
	            {
	              if(temp.charAt(j)>temp1.charAt(j))
	               {
	                   String swap=a[k];
	                   a[k]=a[i];
	                   a[i]=swap;
	                   break;
	               }
	                else
	                break;
	            }
	        }
	        }
	        //StringBuilder StrNum=new StringBuilder();
	        System.out.println("LARGEST NUMBER POSSIBLE IS:");
	        
	        for(String out:a)
	        {
	            //StrNum.append(out);
	            System.out.print(out);
	        }
	        //int finalInt=Integer.parseInt(StrNum.toString());
	        //System.out.println("LARGEST NUMBER IS : "+finalInt);
	    }
	} 

