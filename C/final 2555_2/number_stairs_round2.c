#include<stdio.h>
void main()
{
    int x[501];
    int count=0;
    for(;;){
        scanf("%d",&x[count]);
        if(x[count]<0 || x[count]>=10){
            break;
        }
        count++;
    }

    int count2=count;
    int p=1;
    for(int i=0;i<count;i++){
        for(int k=count2-1;k>0;k--){
            printf(" ");
        }
        for(int j=0;j<p;j++){
            printf("%d",x[i]);
        }
        printf("\n");
        p++;
        count2--;
    }

}
