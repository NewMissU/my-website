#include<stdio.h>
#include<limits.h>
void main()
{
    int max=INT_MIN;
    int count=0;
    int x[501];
    while(1){
        for(int i=0;i<501;i++){
            scanf("%d",&x[i]);
            if(x[i]<0 || x[i]>=10){
                break;
            }
            else{
                count++;
            }
        }
        if(count>max){
            max=count;
        }
        for(int i=0;i<count;i++){
            for(int k=max-1;k>i;k--){
                printf(" ");
            }
            for(int j=0;j<=i;j++){
                printf("%d",x[i]);
            }
        printf("\n");
        }
        if(x<0 || x>=10){
            break;
        }
    }
}

