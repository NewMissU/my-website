#include<stdio.h>
void main()
{
    int n;
    float sum=0,av=0;
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        int x;
        scanf("%d",&x);
        if(x<=0){
            printf("Not positive\n");
            break;
        }
        sum+=x;
        //printf("sum = %d\n av = %d\n",sum,av);
    }
    av=sum/i;
    //printf("sum = %d\n av = %d\n",sum,av);
    printf("%.4f\n",av);
}
