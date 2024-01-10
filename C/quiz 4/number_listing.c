#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    int arr[10001];
    for(int i=0;i<10001;i++){   //clean array = 0
        arr[i]=0;
    }
    for(int i=0;i<n;i++){
        int A;
        scanf("%d",&A);
        arr[A]=1;
    }
    for(int i=0;i<10001;i++){
        if(arr[i]==1){
            printf("%d ",i);
        }
    }

}
