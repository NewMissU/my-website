#include<stdio.h>
#include<limits.h>
void main()
{
    int diff,d_max=INT_MIN;
    while(1){
        int max,min;
        scanf("%d%d",&min,&max);
        if(max==0 && min==0){
            break;
        }
        diff=abs(max-min);
        if(diff>d_max){
            d_max=diff;
        }
    }
    printf("%d \n",d_max);
}
