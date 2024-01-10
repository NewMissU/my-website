#include<stdio.h>
#include<limits.h>

//int countMax(int* arData, int N);

void main()
{
    int max=INT_MIN;
    int n;
    scanf("%d",&n);
    int arData[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arData[i]);
        if(arData[i]>=max){
            max=arData[i];
        }
    }

    int count=0;
    for(int i=0;i<n;i++){
        if(arData[i]>=max){
            count++;
        }
    }


    /*for(int i=0;i<n;i++){
        printf("%d ",arData[i]);
    }*/

    //printf("%d %d",max,count);
    printf("%d",count);

}
