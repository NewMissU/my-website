#include<stdio.h>
void main()
{
    int start,stop,n,t;
    scanf("%d%d%d",&start,&stop,&n);
    if(start>stop){
        t=start;        //t=temporary input transfer value
        start=stop;
        stop=t;
    }
    for(int i=start;i<=stop;i++){
            printf("%d: ",i);
        for(int j=1;j<=n;j++){
            printf("%d ",i*j);
        }
        printf("\n");
    }
}
