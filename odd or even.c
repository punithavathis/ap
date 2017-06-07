#include<stdio.h>
int main()
{
int n,remainder;
printf("enter the number:\n");
scanf("%d",&n);
remainder=n%2;
if(remainder==0)
printf("the entered value is even:\n",n);
else
printf("the entered value is odd:\n",n);
return 0;
}
