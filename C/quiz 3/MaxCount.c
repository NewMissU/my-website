#include<stdio.h>
void main()
{
    int countmax=0,order=0;
    int count=0;
    int k,n;
    scanf("%d%d",&k,&n);
    for(int i=1;i<=n;i++){
        count=0;
        while(1){
            int x;
            scanf("%d",&x);
            if(x==0){
                break;
            }
            if(x>0 && x%k==0){
                count++;
            }
            /*if(count>countmax){
                max=count;
            }*/
        }
        //printf("count = %d\n",count); // check count
        if(count>=countmax){
            order=i;
            countmax=count;
        }
        //printf("%d ",order); //check
        //printf("%d\n",count); //check
    }
    printf("%d ",order);
    printf("%d\n",countmax); // check count
}
