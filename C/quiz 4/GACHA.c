#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        arr[i]=0;
    }
    int A;
    int count=0;
    double percent=0;
    for(;;){
        scanf("%d",&A);
        arr[A]+=1;
        count++;
        if(A==0){
            break;
        }
    }
    /*for(int i=1;i<=n;i++){      //check arr[A]
        if(arr[i]>0){
            printf("%d ",arr[i]);
        }
    }
    printf("\n");*/
    for(int i=1;i<=n;i++){
        if(arr[i]>0){
            percent=((double)arr[i]/(count-1))*100;
        }
        printf("%.2lf%%\n",percent);
    }
}
