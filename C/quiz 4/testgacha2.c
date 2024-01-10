#include<stdio.h>
void main()
{
    int arr[10001];
    for(int i=0;i<10001;i++){
        arr[i]=0;
    }
    int n;
    scanf("%d",&n);
    int A;
    int count=0;
    double percent=0;
    for(;;){
        for(int i=0;i<10001;i++){
            scanf("%d",&A);
            arr[A]+=1;
            count++;
            if(A==0){
                break;
            }
        }
        if(A==0){
                break;
            }
    }
    for(int i=1;i<=n;i++){      //check arr[A]
        if(arr[i]>0){
            printf("%d ",arr[i]);
        }
    }
    printf("\n");
    for(int i=1;i<=n;i++){
        if(arr[i]>0){
            percent=((double)arr[i]/(count-1))*100;
        }
        printf("%.2lf%%\n",percent);
    }
}
