#include<stdio.h>
void main()
{
    int x,y;
    scanf("%d%d",&x,&y);
    if(x==1 && y==1){
        printf("0");
    }
    else if(x==1 && y==2){
        printf("2");
    }
    else if(x==1 && y==3){
        printf("1");
    }
    else if(x==2 && y==1){
        printf("1");
    }
    else if(x==2 && y==2){
        printf("0");
    }
    else if(x==2 && y==3){
        printf("2");
    }
    else if(x==3 && y==1){
        printf("2");
    }
    else if(x==3 && y==2){
        printf("1");
    }
    else if(x==3 && y==3){
        printf("0");
    }
}
