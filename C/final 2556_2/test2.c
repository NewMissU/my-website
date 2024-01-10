#include<stdio.h>
void main(){
    int k,sum=0,sum2=0,sum3=0;
    scanf("%d",&k);
    int arr[k][k];

    for(int r=0;r<k;r++){
        for(int c=0;c<k;c++){
            scanf("%d",&arr[r][c]);
        }
    }
    int x=(k+1)/2;

    for(int i=0;i<x;i++){
            int sum1=0;
        for(int r=x-(i+1);r<x+i;r++){
            for(int c=x-(i+1);c<x+i;c++){
                sum1+=arr[r][c];
                //printf("%d ",arr[r][c]);
                //printf("%d\n",sum1);
            }
            //printf("\n");
        }
        printf("%d\n",sum1-sum);
        sum=sum1;
    }
}
