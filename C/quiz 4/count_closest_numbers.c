#include<stdio.h>
#include<limits.h>
void main()
{
    int min=INT_MAX;
    int n;  //target
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int count=0;
    int k;
    scanf("%d",&k);
    for(int i=0;i<n;i++){
        int diff = abs(arr[i]-k);
        //printf("diff : %d - %d = %d\n",arr[i],k,diff);
        if(diff < min){
            min = diff;
            count=1;
        }
        else if(diff == min){
            min = diff;
            count++;
        }
        //printf("min : %d\n",min);
        //printf("count : %d\n",count);
        //printf("\n");
    }
    printf("%d\n",min);
    printf("%d\n",count);
}
