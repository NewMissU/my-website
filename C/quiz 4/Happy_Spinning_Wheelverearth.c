#include<stdio.h>
void main(){
    int n;
    scanf("%d",&n);
    int a[n];
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    int s,r;
    scanf("%d %d",&s,&r);

    int i=1;
    for(;;){
        if(i==r){
            break;
        }
        if(s==n){
            s=0;
        }
        i++;
        s++;
    }
     printf("%d",a[s]);
}
