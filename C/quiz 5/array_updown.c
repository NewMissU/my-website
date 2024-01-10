#include<stdio.h>
void main()
{
    int k;
    scanf("%d",&k);
    int arr[k][k];
    //input
    for(int r=0;r<k;r++){
        for(int c=0;c<k;c++){
            scanf("%d",&arr[r][c]);
        }
    }
    //up
    int sumUp=0;
    for(int r=0;r<k-1;r++){
        for(int c=r+1;c<k;c++){
            //printf("%d ",arr[r][c]);
            sumUp+=arr[r][c];
        }
    }
    //printf("\nsumUp = %d\n",sumUp);

    //down
    int sumDown=0;
    for(int r=1;r<k;r++){
        for(int c=0;c<r;c++){
            //printf("%d ",arr[r][c]);
            sumDown+=arr[r][c];
        }
        //printf("\n");
    }
    //printf("sumDown = %d\n",sumDown);
    //output
    printf("%d\n",sumUp);
    printf("%d",sumDown);
}
