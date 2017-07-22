#include <stdio.h>
#include<string.h>
int main()
{
    int num,i;
    scanf("%d",&num);
    int a[num+1];
    for(i=0;i<num;i++){
        scanf("%d",&a[i]);
    }
    int uniq=0;
    for(i=0;i<num;i++){
        uniq=uniq^a[i];
    }
    printf("%d",uniq);
    return 0;
}