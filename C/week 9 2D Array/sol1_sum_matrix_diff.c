#include<stdio.h>
void main()
{
//Sol 1
    int n;
    scanf("%d",&n);
    int arr[n][n];
    //input
    for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){
            scanf("%d",&arr[r][c]);
        }
    }

    //output
    int sum=0;
    for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){
            //printf("|(%d,%d)-(%d,%d)| ",r,c,c,r);
            printf("|%d-%d| ",arr[r][c],arr[c][r]);
            sum += abs(arr[r][c]-arr[c][r]);
        }
    }
    printf("%d",sum/2);
}
