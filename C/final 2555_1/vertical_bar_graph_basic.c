#include<stdio.h>
#include<limits.h>
void main()
{
    int max=INT_MIN;
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
        if(arr[i]>max){
            max=arr[i];
        }
    }

    int distance[n];
    for(int r=0;r<max;r++){
        for(int c=0;c<n;c++){
            distance[c]=max-arr[c];
            if(r>distance[c]-1){
                printf("*");
            }
            else{
                printf(" ");
            }
        }
        printf("\n");
    }

}
