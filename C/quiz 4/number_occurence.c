#include<stdio.h>
void main()
{
    int count=0;
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int target;
    scanf("%d",&target);
    for(int i=0;i<n;i++){
        if(target == arr[i]){
            printf("%d ",i+1);
            count++;
        }
    }
    if(count == 0){
        printf("0");
    }
}
