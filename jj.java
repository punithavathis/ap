package guviprogram;
import java.util.Scanner;
public class jj {

	public static void main(String[] args) {
		int num=0;
		int reversenum=0;
		System.out.println("input the number");
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
while(num!=0){
	reversenum=reversenum*10;
	reversenum=reversenum+num%10;
	num=num/10;}
	System.out.print(reversenum);

	}

}
