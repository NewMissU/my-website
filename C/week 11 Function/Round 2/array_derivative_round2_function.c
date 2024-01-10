#include<stdio.h>
void derivative(int* arr, int n){
    int diff[n];
    printf("0 ");
    for(int i=1;i<n;i++){
        diff[i]=arr[i]-arr[i-1];
        printf("%d ",diff[i]);
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
    derivative(arr,n);

}
