#include<stdio.h>
//func
void diff_func(int* arr,int n)
{
    for(int i=0;i<n-1;i++){
        printf("%d ",arr[i+1]-arr[i]);
    }
}


void main()
{
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("0 ");
    diff_func(arr,n);
    /*for(int i=1;i<n;i++){
        printf("%d ",arr[i]-arr[i-1]);
    }*/

}
