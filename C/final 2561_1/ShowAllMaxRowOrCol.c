#include<stdio.h>
#include<limits.h>
void main()
{
    int max=INT_MIN;
    int n;
    scanf("%d",&n);
    int arr[n][n];
    for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){
            scanf("%d",&arr[r][c]);
        }
    }

    int sumRow[n],sumCol[n];

    //calculate
    for(int r=0;r<n;r++){
        sumRow[r]=0;
        sumCol[r]=0;
        for(int c=0;c<n;c++){
            sumRow[r]+=arr[r][c];
            sumCol[r]+=arr[c][r];
        }
        if(sumRow[r]>max){
            max=sumRow[r];
        }
        if(sumCol[r]>max){
            max=sumCol[r];
        }
    }

    int countRow=0,countCol=0;
    int positionRow[n],positionCol[n];
    for(int r=0;r<n;r++){
        positionRow[r]=0;
        positionCol[r]=0;
        if(sumRow[r]==max){
            countRow++;
            positionRow[r]=r+1;
        }
        if(sumCol[r]==max){
            countCol++;
            positionCol[r]=r+1;
        }
    }

    printf("max %d\n",max);
    if(countRow>0){
        printf("row ");
        for(int r=0;r<n;r++){
            if(positionRow[r]>0){
                printf("%d ",positionRow[r]);
            }
        }
        printf("\n");
    }
    if(countCol>0){
        printf("col ");
        for(int r=0;r<n;r++){
            if(positionCol[r]>0){
                printf("%d ",positionCol[r]);
            }
        }
    }





}
