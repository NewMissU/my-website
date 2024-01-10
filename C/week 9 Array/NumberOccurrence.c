#include<stdio.h>
void main()
{
    int count=0;
    int n;
    scanf("%d",&n);
    int x[n];
    for(int i=0;i<n;i++){
        scanf("%d",&x[i]);
    }
    int target;
    scanf("%d",&target);
    for(int i=0;i<n;i++){
        if(target==x[i]){
            printf("%d ",i+1);
            count++;
        }
    }
    if(count==0){
        printf("0");
    }
}
