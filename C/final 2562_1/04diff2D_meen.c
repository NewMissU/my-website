#include<stdio.h>
void main(){
    int r,c,i,j;
    scanf("%d%d",&r,&c);

    int arr[r][c];
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            scanf("%d",&arr[i][j]);
        }
    }

    int k;
    scanf("%d",&k);

    int sum=0;
    if(k==1){
        for(int i=0;i<r;i++){
            for(int j=0;j<c-1;j++){
                sum=arr[i][j+1]-arr[i][j];
            }
            //printf("%d = %d - %d \n",sum,arr[i][j+1],arr[i][j]);
            printf("%d \n",sum);
        }
        printf("\n");
    }
    if(k==2){
        for(int i=0;i<r-1;i++){
            for(int j=0;j<c;j++){
                sum=arr[i+1][j]-arr[i][j];
            }
            //printf("%d = %d - %d \n",sum,arr[i+1][j],arr[i][j]);
            //printf("%d \n",sum);
        }

        for(int i=0;i<r-1;i++){
            for(int j=0;j<c;j++){
                sum=arr[i][j+1]-arr[i][j];
                printf("%d \n",sum);
            }
            //printf("%d = %d - %d \n",sum,arr[i][j+1],arr[i][j]);
            //printf("%d \n",sum);
        }
        printf("\n");
    }
}
