#include<stdio.h>
int isUnique(int* arData,int n){
    int isUnique1=1;
    for(int i=0;i<n;i++){
    int num=arData[i],count=0;
        for(int j=i+1;j<n;j++){
            if(num==arData[j]){
                count++;
            }
        }
        if(count>0){
            isUnique1=0;
        }
    }
    return isUnique1;
}

/*int isUnique(int* arr,int n){
    int isUnique1=1;
    for(int j=0;j<n;j++){
        int x=arr[j];
        int count=0;
        for(int i=j+1;i<n;i++){
            if(x==arr[i]){
                count++;
            }
        }
        if(count>0){
            isUnique1=0;
        }
    }
    return isUnique1;
}*/


void main(){
    int n;
    scanf("%d",&n);
    int arData[n];
    for(int i=0;i<n;i++){
        scanf("%d",arData[i]);
    }

    int x=isUnique(arData,n);
    printf("%d",x);
}

/*int isUnique(int* arr,int n){
    int isUnique1=1;
    for(int j=0;j<n;j++){
        int x=arr[j];
        int count=0;
        for(int i=j+1;i<n;i++){
            if(x==arr[i]){
                count++;
            }
        }
        if(count>0){
            isUnique1=0;
        }
    }
    return isUnique1;
}

#include<stdio.h>
void main(){
    int n;
    scanf("%d",&n);

    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }

    int x=isUnique(arr,n);
    printf("%d",x);
}*/



