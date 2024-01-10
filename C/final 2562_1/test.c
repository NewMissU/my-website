#include<stdio.h>
void main(){
    int n,i;
    scanf("%d",&n);

    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }

    int k;
    scanf("%d",&k);

    int sum=0;
    for(int i=0;i<n-1;i++){
        int c=i+1,p=i;
        if(k==1){
            sum=arr[c]-arr[p];
            c++;
            p++;
            printf("%d ",sum);
        }
    }

    for(int i=n-1;i>0;i--){
        if(k==2){
            int c1=i-1,p1=i;
            sum=arr[c1]-arr[p1];
            //c--;
            //p--;
            printf("%d ",sum);
        }
    }
}
