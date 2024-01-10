#include<stdio.h>

void main()
{
    int exp;
    scanf("%d",&exp);
    double sum=1;
    for(int i=0;i<exp;i++){
        sum*=10;
    }
    printf("%.0lf",sum);
}
