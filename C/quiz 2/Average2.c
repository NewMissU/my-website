#include<stdio.h>
void main()
{
    int n,i=0;
    float sum=0,av=0;
    scanf("%d",&n);
    while(i<n){
        int x;
        scanf("%d",&x);
        if(x<=0){
            printf("Not positive\n");
            break;
        }
        sum+=x;
        //printf("sum = %d\n av = %d\n",sum,av);
        i++;
    }
    av=sum/i;
    //printf("sum = %d\n av = %d\n",sum,av);
    printf("%.4f",av);
}
