#include<stdio.h>
void main()
{
    int sumlow=0,sumhigh=0;
    //int countlow=0,counthigh=0;
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int target;
    scanf("%d",&target);
    for(int i=0;i<n;i++){
        if(arr[i]<target){
            sumlow+=arr[i];
        }
        else if(arr[i]>target){
            sumhigh+=arr[i];
        }
    }
    if(sumhigh > sumlow){
        printf("%d",sumhigh);
    }
    else if(sumhigh < sumlow){  // <=
        printf("%d",sumlow);
    }
    else if(sumhigh == sumlow){
        printf("%d",sumhigh);
    }
}
