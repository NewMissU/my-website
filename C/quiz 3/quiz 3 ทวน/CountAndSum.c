#include<stdio.h>
void main()
{
    int count=0,countk=0;
    int k,sum=0;
    scanf("%d",&k);
    while(1){
        int x;
        scanf("%d",&x);
        if(x%k==0 && x>0){
            countk++;
            sum+=x;
        }
        if(x==0){
            break;
        }
        else{
            count++;
        }

    }
    printf("%d\n",count);
    printf("%d\n",countk);
    printf("%d\n",sum);
}
