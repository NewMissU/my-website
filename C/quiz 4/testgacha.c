#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    double arr[n];
    for(int i=0;i<n;i++){
        arr[i]=0;
    }
    int A;
    int count=0;
    double percent=0;
    for(;;){
        scanf("%d",&A);
        if(A==0){
            break;
        }
        arr[A]+=1;
        count++;
    }
    /*for(int i=1;i<=n;i++){      //check arr[A]
        if(arr[i]>0){
            printf("%d ",arr[i]);
        }
    }
    printf("\n");*/
    for(int i=1;i<=n;i++){
        if(arr[i]>0){
            percent=arr[i]/count*100;
        }
        printf("%.2lf%%\n",percent);
    }
    printf("count = %d\n",count);
}
