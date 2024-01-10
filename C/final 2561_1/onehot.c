#include<stdio.h>
#include<limits.h>
void main()
{
    int n;
    scanf("%d",&n);
    int arr[n];
    int max=INT_MIN,min=INT_MAX;
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
        if(arr[i]>max){
            max=arr[i];
        }
    }

    for(int r=0;r<n;r++){
        for(int c=0;c<=max;c++){
            if(arr[r]==c){
                printf("1 ");
            }
            else{
                printf("0 ");
            }
        }
        printf("\n");
    }












}
