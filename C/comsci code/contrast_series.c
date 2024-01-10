#include<stdio.h>
void main()
{
    int m,n;
    scanf("%d%d",&m,&n);
    int sum=0,x=3,y=1,x2,y2;
    while(x<=m){
        sum+=x*y;
        x2=x+y;
        y2=x-y;
        x=x2;
        y=y2;
    }
    printf("%d",sum);
}
