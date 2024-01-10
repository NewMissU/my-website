#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    int arr[n];
    double sum=0;
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
        sum+=arr[i];
    }
    double avg = sum/n;
    printf("%.2lf ",avg);

    double var=0;
    double sumvar=0;
    for(int i=0;i<n;i++){
        sumvar+=(arr[i]-avg)*(arr[i]-avg);
    }
    var = sumvar/(n-1);
    printf("%.2lf",var);


}
