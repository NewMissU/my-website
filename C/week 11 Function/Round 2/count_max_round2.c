#include<stdio.h>
#include<limits.h>
void main()
{
    int max=INT_MIN;
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
        if(arr[i]>max){
            max=arr[i];
        }
    }

    int count=0;
    for(int i=0;i<n;i++){
        if(arr[i]==max){
            count++;
        }
    }
    printf("%d",count);
}
