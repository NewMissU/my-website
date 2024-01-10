#include<stdio.h>
#include<limits.h>
void main()
{
    int x_max=INT_MIN,x_min=INT_MAX,diff; //32000 -32000
    while(1){
        int x;
        scanf("%d",&x);
        if(x<=0){
            break;
        }
        if(x%2!=0&&x>0){
            if(x>x_max){
                x_max=x;
            }
            if(x<x_min){
                x_min=x;
            }
        }
        //diff=x_max-x_min;
        //printf("max %d\nmin %d\ndiff %d\n",x_max,x_min,diff);
    }
    diff=x_max-x_min;
    printf("%d\n%d\n%d\n",x_max,x_min,diff);
}
