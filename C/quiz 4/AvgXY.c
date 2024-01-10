#include<stdio.h>
void main()
{
    double sum=0;
    double avg=0;
    int count=0;
    int n;
    scanf("%d",&n);
    int a[n];
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    int x,y;
    scanf("%d%d",&x,&y);
    for(int i=0;i<n;i++){
        if(a[i]>=x && a[i]<=y){
            count++;
            sum+=a[i];
        }
        avg=sum/count;
        //printf("count = %d\n",count);
        //printf("sum = %d\n",sum);
        //printf("avg = %.2lf\n",avg);
    }
    if(count>0){
        printf("%d\n",count);
        //printf("sum = %d\n",sum);
        printf("%.2lf",avg);
    }
    if(count==0){
        printf("%d\n",count);
        printf("none");
    }
}
