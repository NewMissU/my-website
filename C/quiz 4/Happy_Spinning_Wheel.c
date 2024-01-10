#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int s,r;
    scanf("%d",&s,&r);      // 1  10
    for(int i=s;i<=s+r;i++){    //1 - 11
        printf("%d",arr[s+r]);
    }
}
