#include<stdio.h>
void main()
{
    int count=0;
    int x[501];
    for(;;){
        for(int i=0;i<501;i++){
            scanf("%d",&x[i]);
            if(x[i]<0 || x[i]>=10){
                break;
            }
            else{
                count++;
            }
        }
        for(int i=0;i<count;i++){
            for(int k=count-1;k>i;k--){
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
