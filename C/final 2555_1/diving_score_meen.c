#include<stdio.h>
#include<limits.h>
void main(){
    int n;
    scanf("%d",&n);

    int num,sum=0,max=INT_MIN,min=INT_MAX;
    for(int i=0;i<n;i++){
        scanf("%d",&num);
        sum+=num;
        if(num>max){
            max=num;
        }
        if(num<min){
            min=num;
        }
        //printf("max%d  : %d\n",i+1,max);
        //printf("min%d  : %d\n",i+1,min);
    }
    //printf("sum : %d\n",sum);
    if(n==3){
        printf("%d",sum);
    }else if(n>3){
        printf("%d",sum-max-min);
    }
}
