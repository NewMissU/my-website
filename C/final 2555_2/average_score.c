#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    double x;
    double sum=0;
    for(int i=0;i<n;i++){
        scanf("%lf",&x);
        sum+=x;
    }
    double avg=sum/n;
    printf("%lf",avg);
}
