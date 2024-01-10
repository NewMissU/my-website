#include<stdio.h>
void main()
{
    int x,y,z;
    scanf("%d%d%d",&x,&y,&z);
    if((z==4) || (z==5) && (y==0)){          //ทำไมไม่ print ให้กุครับ (y==0) && (z==4 || z==5)
        printf("cannot divide by zero");
    }
    else if(z==1){
        printf("%d",x+y);
    }
    else if(z==2){
        printf("%d",x-y);
    }
    else if(z==3){
        printf("%d",x*y);
    }
    else if(z==4){
        printf("%d",x/y);
    }
    else if(z==5){
        printf("%d",x%y);
    }
}
