#include<stdio.h>
void main()
{
    int sum=0,sum1=0,sum2=0;
    int x,y;
    scanf("%d%d",&x,&y);
    while(1){
        int z;
        scanf("%d",&z);
        if(z<=0){
            break;
        }
        if(z%x==0 && z%y!=0){
            sum+=z;
        }
        //printf("sum = %d\n",sum);
        else if(z%y==0 && z%x!=0){
            sum1+=z;
        }
        //printf("sum = %d\n",sum);
        //printf("sum1 = %d\n",sum1);
        if(z%x==0 || z%y==0){
            sum2+=z;
        }
    }
    printf("%d\n",sum);
    printf("%d\n",sum1);
    printf("%d\n",sum2);
}
