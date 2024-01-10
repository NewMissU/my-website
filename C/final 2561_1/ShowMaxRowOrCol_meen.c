#include<stdio.h>
#include<limits.h>
void main(){
    int n,r,c,sum_r,sum_c;
    scanf("%d",&n);

    int a[n][n];
    for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){
            scanf("%d",&a[r][c]);
        }
    }

    int positionRow,positionCol;
    int flag;
    int max=INT_MIN;
    for(int r=0;r<n;r++){
        int sum_r=0,sum_c=0;
        for(int c=0;c<n;c++){
            sum_r+=a[r][c];
            sum_c+=a[c][r];
            if(sum_r>max && sum_r>=sum_c){
                max=sum_r;
                positionRow=r+1;
                flag=1;
            }
            else if(sum_r>=max && sum_r>sum_c){
                max=sum_r;
                positionRow=r+1;
                flag=1;
            }else if(sum_c>max && sum_c>sum_r){
                max=sum_c;
                positionCol=r+1;
                flag=0;
            }
            /*else if(sum_r==sum_c && sum_r>max ){
                max=sum_r;
                positionRow=r+1;
                flag=1;
            }*/

        }


        //printf("row = %d ",sum_r);
        //printf("col = %d ",sum_c);
        //printf("max = %d \n",max);
    }
        printf("max %d ",max);
        if(flag==0){
            printf("col %d",positionCol);
        }
        else if(flag == 1){
            printf("row %d",positionRow);
        }
}
