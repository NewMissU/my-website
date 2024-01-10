#include<stdio.h>
void main()
{
    int x,y,sum;
    scanf("%d%d",&x,&y);
    while(1){
        int z;
        scanf("%d",&z);
        if(z<=0){
            break;
        }
        if(x<=z && z<=y){  // x z y
            sum+=z;
        }
        else if(y<=z && z<=x){  // y z x
            sum+=z;
        }
        //printf("sum = %d\n",sum);
    }
    printf("%d\n",sum);
}
