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
    for(int r=max;r>0;r--){
        for(int c=0;c<n;c++){
            if(arr[c]-r>=0){
                if(r%10==0){
                    printf("0");
                }
                else if(r%5==0){
                    printf("5");
                }
                else{
                    printf("*");
                }
            }
            else{
                printf(" ");
            }
        }
        printf("\n");
    }
}
