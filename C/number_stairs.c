#include<stdio.h>
void main()
{
    int x[501];
    int i=0;
    while(1){
        scanf("%d",&x[i]);
        if(x[i]<0 || x[i]>9){
            break;
        }
        i++;
    }
    int value_count=i;
    for(int r=0;r<i;r++){
        for(int k=0;k<value_count-1;k++){
            printf(" ",k);
        }
        for(int c=0;c<r+1;c++){
            printf("%d",x[r]);
        }
        value_count--;
        printf("\n");
    }
}
