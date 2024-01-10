#include<stdio.h>
#include<limits.h>
void main()
{
    int xMax=INT_MIN,xMin=INT_MAX;
    //printf("%d %d",xMax,xMin);
    while(1){
        int x;
        scanf("%d",&x);
        if(x<=0){
            break;
        }
        if(x%2!=0 && x>0){
            if(x>xMax){
                xMax=x;
            }
            if(x<xMin){
                xMin=x;
            }
        }
        //int diff=xMax-xMin;
        //printf("xmax = %d \nxmin = %d\n",xMax,xMin);
        //printf("diff = %d\n",diff);
    }
    int diff=xMax-xMin;
    //printf("xmax = %d \nxmin = %d\n",x_max,x_min);
    //printf("diff = %d\n",diff);
    printf("%d \n%d\n",xMax,xMin);
    printf("%d\n",diff);
}
