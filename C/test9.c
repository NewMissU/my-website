#include<stdio.h>
int isUnique(int* arData,int n){
    int count=0;
    for(int i=0;i<n;i++){
    int num=arData[i];
        for(int j=i+1;j<n;j++){
            if(num==arData[j]){
                count++;
            }
        }
    }
    if(count==0){
        return 1;
    }else{
        return 0;
    }
}

void main(){
    int n;
    scanf("%d",&n);
    int arData[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arData[i]);
    }

    int x=isUnique(arData,n);
    printf("%d",x);
}
