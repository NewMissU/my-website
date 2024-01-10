#include<stdio.h>
int arr[50000];
void main()
{
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        arr[i] = 0;
    }

    for(int i=0;i<n;i++){
        int x;
        scanf("%d",&x);
        arr[x]=1;
    }

    int count=0;
    int sum=0;
    for(int i=0;i<50000;i++){
        if(arr[i]==1){
            //printf("%d ",i);
            sum+=i;
            count++;
        }
    }
    //printf("\n");
    printf("%d\n",count);
    printf("%d",sum);



}
