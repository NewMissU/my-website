#include<stdio.h>
void main(){
    int n,k,max=0;
    scanf("%d %d",&n,&k);
    int x[n];
    for(int i=0;i<n;i++){
        scanf("%d",&x[i]);
    }
    int p;
    for(int i=0+k;i<n-k;i++){
        int sum=0,c=i;
        for(int j=0;j<(k*2)+1;j++){
            p=c-k;
            sum+=x[p];
            c++;
        }
        if(sum>max){
            max=sum;
        }
    }
    printf("%d",max);
}
