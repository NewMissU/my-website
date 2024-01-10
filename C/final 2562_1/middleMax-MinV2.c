#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    int arr[100];
    for(int i=0;i<n;i++){
        int count=0;
        for(;;){
            scanf("%d",&arr[count]);
            if(arr[count]==0){
                break;
            }
            count++;
        }

        for(int j=1;j<count-1;j++){ // 1st mid --> last mid (before last number not 0)
            if(arr[j]>arr[j-1] && arr[j]>arr[j+1]){
                printf("max %d ",arr[j]);
            }
            else if(arr[j]<arr[j-1] && arr[j]<arr[j+1]){
                printf("min %d ",arr[j]);
            }
        }
        printf("\n");
    }


}
