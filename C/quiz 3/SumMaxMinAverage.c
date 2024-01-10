#include<stdio.h>
#include<limits.h>
void main()
{
    int sum=0,max=INT_MIN,min=INT_MAX,ordermax=0,ordermin=0,count=0,allsum=0;
    double avg=0;
    while(1){
        int n;
        scanf("%d",&n);
        if(n>0){
            for(int i=1;i<=n;i++){
                int x;
                scanf("%d",&x);
                sum+=x;
            }
            count++;
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
            /*printf("%d\n",sum);
            printf("summax = %d %d\n",ordermax,max);
            printf("summin = %d %d\n",ordermin,min);
            printf("allsum = %d\n",allsum);
            printf("avg = %.2lf\n",avg);*/
            printf("%d\n",sum);
            sum=0;
            }
        else if(n<=0){
            break;
        }
    }
    printf("%d %d\n",ordermax,max);
    printf("%d %d\n",ordermin,min);
    printf("%.2lf\n",avg);
}
