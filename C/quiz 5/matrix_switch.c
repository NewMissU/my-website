#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    int arr[n][n];
    for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){
            scanf("%d",&arr[r][c]);
        }
    }
    int D;      // 1 horizontal 2 ventical
    scanf("%d",&D);
    //1 horizontal
    if(D==1){
        for(int r=0;r<n;r++){
            for(int c=n/2;c<n;c++){         //back
                printf("%d ",arr[r][c]);
            }
            for(int c1=0;c1<n/2;c1++){      //front
                printf("%d ",arr[r][c1]);
            }
        printf("\n");
        }
    }

    //2 ventical
    if(D==2){
        //down
        for(int r=n/2;r<n;r++){
            for(int c=0;c<n;c++){
                printf("%d ",arr[r][c]);
            }
        printf("\n");
        }
        //up
        for(int r1=0;r1<n/2;r1++){
            for(int c1=0;c1<n;c1++){
                printf("%d ",arr[r1][c1]);
            }
        printf("\n");
        }
    }



}
