#include<stdio.h>
void main()
{
    int state,x,sum=0,pay=0,income=0;
    int t_s=0,t_p=0;
    while(1) {
        scanf("%d",&state);
        if(state==0){
            break;
        }
        scanf("%d",&x);
        if(state==1){
            sum=sum+x;
            t_s++;
        }
        else if (state==2){
            pay= pay+x;
            t_p++;
        }
    }
    income=sum-pay;
    printf("%d %d\n",t_s,t_p);
    printf("%d %d %d",sum,pay,income);
}
