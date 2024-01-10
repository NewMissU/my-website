#include<stdio.h>
void main()
{
    int count=0;
    int x,y;
        scanf("%d%d",&x,&y);
    while(1){
        int z;
        scanf("%d",&z);
        if(z<0){
            break;
        }
        if(x>=z && z>=y){     //y>z>x
            count++;
        }
        else if(y>=z && z>=x){     //x>z>y
            count++;
        }
    }
    printf("%d",count);

}
