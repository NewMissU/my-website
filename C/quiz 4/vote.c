#include<stdio.h>
#include<limits.h>
void main()
{
    int arr[101];
    for(int i=1;i<=101;i++)
    {
        arr[i]=0;
    }
    int max=INT_MIN;
    int n,k;
    scanf("%d%d",&n,&k);
    //int arr[101];
    /*for(int i=1;i<=101;i++)
    {
        arr[i]=0;
    }*/
    for(int i=1;i<=k;i++){
        int A;
        scanf("%d",&A);
        arr[A]+=1;
    }
    int order=0;
    for(int i=1;i<=n;i++){
        if(arr[i]>max){
            max=arr[i];
            order=i;
        }
    }
    printf("%d\n",order);
    printf("%d\n",max);
}
