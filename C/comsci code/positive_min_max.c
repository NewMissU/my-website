#include<stdio.h>
#include<limits.h>
void main()
{
    int x,i=0,max=INT_MIN,min=INT_MAX;
    while (i<8){
        scanf("%d",&x);
        if(x>0){
            if(x>max){
                max = x;
            }
            if(x<min){
                min = x;
            }
        }
        i++;
    }
    printf("%d\n",max);
    printf("%d\n",min);
}
