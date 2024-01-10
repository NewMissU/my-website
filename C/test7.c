#include<stdio.h>
double average(int* a){
    double sum=0;
    for(int i=0;i<8;i++){
        sum+=a[i];
    }
    double avg=sum/8;
    return avg;
}

double variance(int* a,double avg){
    double sum=0;
    for(int i=0;i<8;i++){
        sum+=(a[i]-avg)*(a[i]-avg);
    }
    double vrc=sum/(8-1);
    return vrc;
}

void main(){
    int a[8];
    for(int i=0;i<8;i++){
        scanf("%d",&a[i]);
    }

    double avg=average(a);
    double vrc=variance(a,avg);
    printf("%.2lf %.2lf",avg,vrc);
}
