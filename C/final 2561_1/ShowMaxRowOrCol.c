#include<stdio.h>
#include<limits.h>
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

    int max=INT_MIN;
    int positionRow,positionCol;
    int sumRow[n],sumCol[n];
    /*for(int r=0;r<n;r++){
        sumRow[r]=0;
        sumCol[r]=0;
    }*/

    int flag;
    for(int r=0;r<n;r++){
            sumRow[r]=0;
            sumCol[r]=0;
        for(int c=0;c<n;c++){
            sumRow[r]+=arr[r][c];
            sumCol[r]+=arr[c][r];
            // max 4 row 1 correct
            if(sumRow[r]>max && sumRow[r]>=sumCol[r]){
                max=sumRow[r];
                positionRow=r+1;
                flag=1;
            }
            // max 3 row 3 correct
            else if(sumRow[r]>=max && sumRow[r]>sumCol[r]){
                max=sumRow[r];
                positionRow=r+1;
                flag=1;
            }
            else if(sumCol[r]>max && sumCol[r]>sumRow[r]){
                max=sumCol[r];
                positionCol=r+1;
                flag=0;
            }
        }
        /*printf("row%d = %d ",r+1,sumRow[r]);
        printf("col%d = %d ",r+1,sumCol[r]);
        printf("max = %d \n",max);*/
    }
    printf("max %d ",max);
    if(flag==1){
        printf("row %d",positionRow);
    }
    else if(flag==0){
        printf("col %d",positionCol);
    }





}
