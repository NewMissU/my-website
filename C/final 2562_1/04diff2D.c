#include<stdio.h>
void main()
{
    int row,col;
    scanf("%d%d",&row,&col);
    int arr[row][col];
    for(int r=0;r<row;r++){
        for(int c=0;c<col;c++){
            scanf("%d",&arr[r][c]);
        }
    }
    int k;
    scanf("%d",&k);

    int diff1[row][col];
    if(k==1){
        for(int r=0;r<row;r++){
            for(int c=0;c<col-1;c++){
                diff1[r][c]=arr[r][c+1]-arr[r][c];
                //printf("%d - %d = %d ",arr[r][c+1],arr[r][c],diff1[r][c]);
                printf("%d ",diff1[r][c]);
            }
            printf("\n");
        }
    }
    else if(k==2){
        for(int c=0;c<col;c++){
            for(int r=0;r<row-1;r++){
                diff1[r][c]=arr[r+1][c]-arr[r][c];
                //printf("%d - %d = %d ",arr[r+1][c],arr[r][c],diff1[r][c]);
                //printf("%d ",diff1[r][c]);
            }
        }
        // print horizontal not vertical
        for(int r1=0;r1<row-1;r1++){
            for(int c1=0;c1<col;c1++){
                printf("%d ",diff1[r1][c1]);
            }
            printf("\n");
        }
    }
}
