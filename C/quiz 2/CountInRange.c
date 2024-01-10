#include<stdio.h>
void main()
{
    int x,y;
    int count1=0,count2=0,count3=0;
    scanf("%d%d",&x,&y);
    while (1){
        int z;
        scanf("%d",&z);
        if(z==0){
            break;
        }
        if(x>y){
            if(z>y && z<x){
                count1++;
            }
        }
        if (x<y){
            if(z>x && z<y){
                count1++;
            }
        }
        if (z<x && z<y){
            count2++;
        }
        if (z>x && z>y){
            count3++;
        }
    }
    printf("%d\n%d\n%d",count1,count2,count3);
}
