#include<stdio.h>
#include<limits.h>
void main()
{
    int max=INT_MIN;
    int countk=0,order=0;
    int k,n;
    scanf("%d%d",&k,&n);
    for(int i=1;i<=n;i++){
        countk=0;
        while(1){
            int x;
            scanf("%d",&x);
            if(x%k==0 && x>0){
                countk++;
            }
            if(x==0){
                break;
            }
            if(countk>=max){
                max=countk;
                order=i;
            }
            //printf("countk = %d\n",countk);
        }
    }
    printf("%d ",order);
    printf("%d",max);



}
