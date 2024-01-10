#include<stdio.h>
//Sol 1 non function
void main()
{
    int n=8;
    int x[n];
    for(int i=0;i<n;i++){
        scanf("%d",&x[i]);
    }
    double sum=0;
    double avg;
    for(int i=0;i<n;i++){
        sum+=x[i];
    }
    avg=sum/n;
    //printf("%.2lf",avg);
    //printf("avg = %.2lf\n",avg);
    double variance=0;
    double summation=0;
    for(int i=0;i<n;i++){
        summation += (x[i]-avg)*(x[i]-avg);
    }
    variance = summation/(n-1);
    printf("%.2lf %.2lf",avg,variance);
}
