#include<stdio.h>
#include<limits.h>
void main()
{
    double avg=0;
    int max=INT_MIN,min=INT_MAX;
    int sum=0,allsum=0,ordermax=0,count=0,ordermin=0;
    while(1){
        int n;
        scanf("%d",&n);
        if(n>0){
            count++;
            sum=0;
            for(int i=1;i<=n;i++){
                int x;
                scanf("%d",&x);
                sum+=x;
            }
            if(sum>max){
                max=sum;
                ordermax=count;
            }
            if(sum<min){
                min=sum;
                ordermin=count;
            }
            allsum+=sum;
            avg=(double)allsum/count;
        }
        else if(n<=0){
            break;
        }
        printf("%d\n",sum);
        //printf("sum = %d\n",sum);
        //printf("order = %d\n",order);
        //printf("allsum = %d\n",allsum);
    }
    /*printf("order = %d max = %d\n",ordermax,max);
    printf("order = %d min = %d\n",ordermin,min);
    printf("allsum = %d\n",allsum);
    printf("avg = %.2f\n",avg);*/
    printf("%d %d\n",ordermax,max);
    printf("%d %d\n",ordermin,min);
    //printf("allsum = %d\n",allsum);
    printf("%.2lf\n",avg);
}
