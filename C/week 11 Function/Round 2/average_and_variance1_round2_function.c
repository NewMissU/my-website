#include<stdio.h>
double average(int* arr){
    double sum=0;
    for(int i=0;i<8;i++){
        scanf("%d",&arr[i]);
        sum+=arr[i];
    }
    double avg = sum/8;
    return avg;
}

double variance(int* arr, double avg){
    double var=0;
    double sumvar=0;
    for(int i=0;i<8;i++){
        sumvar+=(arr[i]-avg)*(arr[i]-avg);
    }
    var = sumvar/7;
    return var;
}

void main()
{
    int arr[8];
    double avg=average(arr);    //function use
    printf("%.2lf ",avg);

    double var = variance(arr,avg);
    printf("%.2lf",var);

}
