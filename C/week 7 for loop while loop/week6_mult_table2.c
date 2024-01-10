#include<stdio.h>
void main()
{
    int mul=0,max=0;
    int x;
    scanf("%d",&x);
    max=x*12;
    for(int i=1;i<=12;i++){
        if(x<1 || x>99){
            printf("Number is out of range\n");
            break;
        }
        mul=x*i;
        if(max>=1 && max<10){
            //printf("%d 2",mul);
            printf("%d x %2d = %d\n",x,i,mul);
        }
        if(max>=10 && max<100){
            //printf("%d 2",mul);
            printf("%d x %2d = %2d\n",x,i,mul);
        }
        if(max>=100 && max<1000){
            //printf("%d 3",mul);
            printf("%d x %2d = %3d\n",x,i,mul);
        }
        if(max>=1000 && max<10000){
            //printf("%d 4",mul);
            printf("%d x %2d = %4d\n",x,i,mul);
        }
    }
}
