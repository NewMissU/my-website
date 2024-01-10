#include<stdio.h>
void main()
{
    int count=0;
    int x[501];
    for(int i=0;i<501;i++){
        scanf("%d",&x[i]);
        if(x[i]<0 || x[i]>=10){
            break;
        }
        count++;
        /*for(int j=0;j<;j++){

        }*/
    }

    int p=1,count2=count;
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
