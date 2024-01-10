#include<stdio.h>
void main(){
    int n,max=0;
    scanf("%d",&n);
    int x[n];
    for(int i=0;i<n;i++){
        scanf("%d",&x[i]);
        if(x[i]>max){
        max=x[i];
        }
    }
    int p=max;
    for(int i=0;i<p;i++){
            for(int j=0;j<n;j++){
                if(x[j]<max){
                    printf(" ");
                }else{
                    printf("*");
                }
            }
            printf("\n");
            max--;
    }
}

