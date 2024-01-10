#include<stdio.h>
void main()
{
    int k,n,sum_order;
    scanf("%d%d",&k,&n);
    int ppd = k*100;    // product per day
    for(int i=1;i<=n;i++){
        int order;
        scanf("%d",&order);
        sum_order+=order;
        int day = sum_order/ppd;    // int/int = int
        //printf("day %d\n",day);
        if(sum_order%ppd>0){        // !=0
            day++;
        }
        printf("%d\n",day);
    }
}
