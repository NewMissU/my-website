#include<stdio.h>v
void main()
{
    int k;
    scanf("%d",&k);
    int arr[k][k];
    for(int r=0;r<k;r++){
        for(int c=0;c<k;c++){
            scanf("%d",&arr[r][c]);
        }
    }

//----------------------------------------

//calculate
    int sum1=0;
    for(int i=0;i<(k+1)/2;i++){
        int sum2=0;
        for(int r=k/2-i;r<=k/2+i;r++){
            for(int c=k/2-i;c<=k/2+i;c++){
                //printf("%d ",arr[r][c]);
                sum2+=arr[r][c];
            }
            //printf("\n");
        }
        printf("%d\n",sum2-sum1);
        sum1=sum2;
    }


}
