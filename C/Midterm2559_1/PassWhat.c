#include<stdio.h>
void main()
{
    int s1,s2,s3,s4;
    scanf("%d%d%d%d",&s1,&s2,&s3,&s4);
    int a,b,c,d;
    scanf("%d%d%d%d",&a,&b,&c,&d);
    if(a>=s1){
        printf("1 ");
    }
    if(b>=s2){
        printf("2 ");
    }
    if(c>=s3){
        printf("3 ");
    }
    if(d>=s4){
        printf("4 ");
    }
}
