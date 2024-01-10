#include<stdio.h>
void main()
{
    int sth=0;
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int x;
    scanf("%d",&x);
    for(int i=0;i<n;i++){
        if(i%x==0){
           printf("%d ",arr[i]);
        }
    }
}

