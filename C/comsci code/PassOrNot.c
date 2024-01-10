#include<stdio.h>
void main()
{
    int count=0;
    int a,b,c,d;
    scanf("%d%d%d%d",&a,&b,&c,&d);
    int x1,x2,x3,x4;
    scanf("%d%d%d%d",&x1,&x2,&x3,&x4);
    if(x1>=a){
        printf("1 ");
        count++;
    }
    if(x2>=b){
        printf("2 ");
        count++;
    }
    if(x3>=c){
        printf("3 ");
        count++;
    }
    if(x4>=d){
        printf("4 ");
        count++;
    }
    if(count==0){
        printf("0");
        printf("\nfail");
    }
    else if(count>=3){
        printf("\npass");
    }
    else{
        printf("\nfail");
    }
}
