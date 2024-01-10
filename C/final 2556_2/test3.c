#include<stdio.h>
void main(){
    int k,sum=0,sum1=0,sum2=0,sum3=0;
    scanf("%d",&k);
    int arr[k][k];

    for(int r=0;r<k;r++){
        for(int c=0;c<k;c++){
            scanf("%d",&arr[r][c]);
        }
    }
    int x=(k+1)/2;
    for(int r=x-1;r<x;r++){
        for(int c=x-1;c<x;c++){
            sum+=arr[r][c];
            //printf("%d ",arr[r][c]);
        }
        //printf("\n");
    }
    printf("%d\n",sum);

    //printf("\n");
    for(int r=x-2;r<x+1;r++){
        for(int c=x-2;c<x+1;c++){
            sum1+=arr[r][c];
            //printf("%d ",arr[r][c]);
        }
        //printf("\n");
    }
    printf("%d\n",sum1-sum);

    //printf("\n");
    for(int r=x-3;r<x+2;r++){
        for(int c=x-3;c<x+2;c++){
            sum2+=arr[r][c];
            //printf("%d ",arr[r][c]);
        }
        //printf("\n");
    }
    printf("%d\n",sum2-sum1);

    //printf("\n");
    for(int r=x-4;r<x+3;r++){
        for(int c=x-4;c<x+3;c++){
            sum3+=arr[r][c];
            //printf("%d ",arr[r][c]);
        }
        //printf("\n");
    }
    printf("%d\n",sum3-sum2);
}
