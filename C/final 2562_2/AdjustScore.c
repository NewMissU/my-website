#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    double max;
    double x;
    scanf("%lf%lf",&max,&x);
    double score[n];
    for(int i=0;i<n;i++){
        score[i]=arr[i]*x/max;
        printf("%.1lf ",score[i]);
    }
}
