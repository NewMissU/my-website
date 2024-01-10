#include<stdio.h>
void main()
{
    int sum=0;
    int a,mul,b,mul2;
    scanf("%d%d%d%d",&a,&mul,&b,&mul2);
    int mul3=mul;
    for(int i=a;i<=b;i++){
        for(int j=mul;j<=mul2;j++){
            sum=i*j;
            printf("%d x %d = %d",i,j,sum);
            printf("\n");
            if(i==b && j==mul3){
                break;
            }
            mul=1;
        }
    }
}
