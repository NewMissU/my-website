#include<stdio.h>
int isUnique_func(int* arData, int n){
    int isUnique=1;
    for(int i=0;i<n;i++){
        int countRepeat=0;
        int x=arData[i];
        for(int j=i+1;j<n;j++){
            //printf("%d vs %d : %d\n",x,arData[j],x==arData[j]);
            if(x==arData[j]){
                countRepeat++;
            }
        }
        if(countRepeat > 0){
            isUnique=0;
            break;
        }
    }
    return isUnique;
}

void main()
{
    int n;
    scanf("%d",&n);
    int arData[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arData[i]);
    }

    int isUnique=isUnique_func(arData,n);
    printf("%d",isUnique);
}

