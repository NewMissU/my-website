#include<stdio.h>
#include<limits.h>
void main()
{
    int max=INT_MIN,min=INT_MAX;
    int n;
    scanf("%d",&n);
    int score[n];
    int sumscore=0;
    for(int i=0;i<n;i++){
        scanf("%d",&score[i]);
        sumscore+=score[i];
        if(score[i]>max){
            max=score[i];
        }
        if(score[i]<min){
            min=score[i];
        }
    }
    if(n==3){
        printf("%d",sumscore);
    }
    else{
        printf("%d",sumscore-max-min);
    }
}
