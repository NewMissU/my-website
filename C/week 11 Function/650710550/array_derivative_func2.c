#include<stdio.h>
//func
void derivative_func(int* arr,int n)
{
    for(int i=1;i<n;i++){
        printf("%d ",arr[i]-arr[i-1]);
    }
}
void derivative_func2(int* arr,int Aout,int n)
{
    Aout=[0]=0;
    for(int i=1;i<n;i++){
        Aout[i]=A[i]-A[i-1];
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
    derivative_func(arr,n);
    printf("\n");
    /*for(int i=1;i<n;i++){
        printf("%d ",arr[i]-arr[i-1]);
    }*/
    int arr_out[n];
    derivative2(arr,arr_out,n);
    for(int i=0;i<n;i++){
        printf("%d ", arr_out[i]);
    }

}

