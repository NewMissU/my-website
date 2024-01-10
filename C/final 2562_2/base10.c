#include<stdio.h>

void main()
{
    int n;
    scanf("%d",&n);
    int count=0;
    int value_n=n;
    while(1){
        if(value_n==0){
            break;
        }
        value_n/=10;
        count++;
    }
    int value_n2=n;
    int sum=1;
    for(int i=0;i<count;i++){
        printf("%d x %d\n",value_n2%(10*sum)/sum,sum);
        sum*=10;
    }

}
