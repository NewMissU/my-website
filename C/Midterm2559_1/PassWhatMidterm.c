#include<stdio.h>
void main()
{
    int a,b,c,d;
    scanf("%d%d%d%d",&a,&b,&c,&d);
    int x1,x2,x3,x4;
    scanf("%d%d%d%d",&x1,&x2,&x3,&x4);
    if(x1>=a){
        printf("1 ");
    }
    if(x2>=b){
        printf("2 ");
    }
    if(x3>=c){
        printf("3 ");
    }
    if(x4>=d){
        printf("4 ");
    }
}
