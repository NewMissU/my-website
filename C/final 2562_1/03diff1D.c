#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int k;
    scanf("%d",&k);

    int diff[n-1];
    if(k==1){
        for(int i=0;i<n-1;i++){
            diff[i]=arr[i+1]-arr[i];
            printf("%d ",diff[i]);
        }
    }
    else if(k==2){
        for(int i=n-1;i>0;i--){
            diff[i]=arr[i-1]-arr[i];
            printf("%d ",diff[i]);
        }
    }

}
