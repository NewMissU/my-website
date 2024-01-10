#include<stdio.h>
double average(int* arr,int n){
    double sum=0;
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
        sum+=arr[i];
    }
    double avg = sum/n;
    return avg;
}

double variance(int* arr, double avg, int n){
    double var=0;
    double sumvar=0;
    for(int i=0;i<n;i++){
        sumvar+=(arr[i]-avg)*(arr[i]-avg);
    }
    var = sumvar/(n-1);
    return var;
}

void main()
{
    int n;
    scanf("%d",&n);
    int arr[n];
    double avg=average(arr,n);    //function use
    printf("%.2lf ",avg);

    double var = variance(arr,avg,n);
    printf("%.2lf",var);

}
