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
    sth+=x;
    printf("%d ",arr[0]);
    for(int i=1;i<n;i++){
        if(i==sth){
           printf("%d ",arr[i]);
           sth+=x;
        }
    }
}
