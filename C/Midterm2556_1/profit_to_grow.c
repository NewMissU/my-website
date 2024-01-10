#include<stdio.h>
void main()
{
    int n,k,net=0;
    scanf("%d%d",&n,&k);
    for(int i=1;i<=n;i++){
        int income,pay;
        scanf("%d%d",&income,&pay);
        int sum=income-pay;
        net+=sum;
    }
        if(net>0){
            printf("Profit %d\n",net);
        }
        else if(net<0){
            printf("Loss %d\n",abs(net));
        }
        else if(net==0){
            printf("Breakeven\n");
        }
        if(net>=k){
            printf("Expand\n");
        }
        else if(net>=k/2){
            printf("Wait and see\n");
            int net2=0;
            for(int i=1;i<=n;i++){
                int income,pay;
                scanf("%d%d",&income,&pay);
                int sum2=income-pay;
                net2+=sum2;
            }
            if(net2>0){
                    printf("Profit %d\n",net2);
                }
                else if(net2<0){
                    printf("Loss %d\n",abs(net2));
                }
                else if(net2==0){
                    printf("Breakeven\n");
                }
                if(net2>=k){
                    printf("Expand\n");
                }
                else{
                    printf("Not expand\n");
                }
        }
        else if(net<k/2){
            printf("Not expand\n");
        }
}
