#include<stdio.h>
void main()
{
    int arr[8];
    double sum=0;
    for(int i=0;i<8;i++){
        scanf("%d",&arr[i]);
        sum+=arr[i];
    }
    double avg = sum/8;
    printf("%.2lf ",avg);

    double var=0;
    double sumvar=0;
    for(int i=0;i<8;i++){
        sumvar+=(arr[i]-avg)*(arr[i]-avg);
    }
    var = sumvar/7;
    printf("%.2lf",var);


}
