#include<stdio.h>
void main()
{
    int sum=0,count00=0,count01=0,count10=0,count11=0,a=3;
    while(1){
        int x;
        scanf("%d",&x);
        if(x!=0 && x!=1){
            break;
        }
        if(a==0 && x==0){
            count00++;
        }
        if(a==0 && x==1){
            count01++;
        }
        if(a==1 && x==0){
            count10++;
        }
        if(a==1 && x==1){
            count11++;
        }
        a=x;
        //printf("count00 = %d\ncount01 = %d\ncount10 = %d\ncount11 = %d\n",count00,count01,count10,count11);
    }
    printf("%d\n%d\n%d\n%d",count00,count01,count10,count11);
}
