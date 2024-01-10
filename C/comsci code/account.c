#include<stdio.h>
void main()
{
    int income=0,pay=0;
    int t_in=0,t_p=0;
    while(1){
        int x;
        scanf("%d",&x);
        if(x==0){
            break;
        }
        if(x>0){
            income+=x;
            t_in++;
        }
        else if(x<0){
            pay+=x;
            t_p++;
        }
        //printf("number of income = %d number of pay = %d\n",t_in,t_p);
        //printf("income = %d \npay = %d\n",income,pay);
    }
    int total = income+pay;
    printf("%d %d\n",t_in,t_p);
    printf("%d \n%d\n",income,pay);
    if(total>=0){
        printf("debit\n");
    }
    else{
        printf("credit\n");
    }
}
