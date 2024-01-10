#include<stdio.h>
void main()
{
    int count=0,count2=0,sum=0;
    int k;
    scanf("%d",&k);
    while(1){
        int x;
        scanf("%d",&x);
        if(x==0){
            break;
        }
        if(x>=0 && x%k==0){
            count2++;
            sum+=x;
        }
        count++;
    }
    printf("%d\n",count); // (1)
    printf("%d\n",count2); // (2)
    printf("%d",sum); // (3)
}
