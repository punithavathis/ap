#include<stdio.h>
intmain()
{
int number,original number,remainder,result=0;
printf("enter a three digit number:\n");
scanf("%d",&num);
original number=number;
while(original number!=0)
{
remainder=original number%10;
result=remainder*remainder*remainder;
original nujmber/=10;
}
if(result==number)
printf("%d is an armstrong number:",number);
else
printf("%d is not an armstrong number:",number);
return 0;
}
