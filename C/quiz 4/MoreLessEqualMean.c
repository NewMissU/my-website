#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    int arr[n];
    int sum=0;
    int avg=0;
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    for(int i=0;i<n;i++){
        sum+=arr[i];
    }
    avg=sum/n;
    int countmax=0,countlow=0,countequal=0;
        for(int i=0;i<n;i++){
            if(arr[i]>avg){
            countmax++;
        }
        else if(arr[i]<avg){
            countlow++;
        }
        else if(arr[i]==avg){
            countequal++;
        }
    }
    printf("%d\n",avg);
    printf("%d %d %d",countmax,countlow,countequal);

}
