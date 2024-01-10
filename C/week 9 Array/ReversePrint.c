#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    int x[n];
    for(int i=0;i<n;i++){
        scanf("%d",&x[i]);
    }
    for(int i=n;i>=0;i--){
        printf("%d ",x[i]);
    }
}
