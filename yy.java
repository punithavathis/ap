package guviprogram;
import java.io.*;
import java.util.*;
public class yy {
	public static void main(String args[]){
		int a;
		int t;
		int lcm;
		int b;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the numbers:");
	    int x=sc.nextInt();
	    int y=sc.nextInt();
	    a=x;
	    b=y;
	    while(b != 0)
	    {
	      t = b;
	      b = a%b;
	      a = t;
	    } 
	    lcm = (x*y)/a; 
	    System.out.print("lcm is:"+lcm);
	  }
	}