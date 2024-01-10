#include<stdio.h>
#include<limits.h>
int max=INT_MIN;
int CountRepeat(int n){
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
    //printf("Function : %d\n",count);
    return count;
}

void main()
{
    int n;
    scanf("%d",&n);
    //int arData[n];
    /*for(int i=0;i<n;i++){
        scanf("%d",&arData[i]);
        if(arData[i]>=max){
            max=arData[i];
        }
    }

    //loop count
    int count=0;
    for(int i=0;i<n;i++){
        if(arData[i]>=max){
            count++;
        }
    }*/


    /*for(int i=0;i<n;i++){
        printf("%d ",arData[i]);
    }*/

    //printf("%d %d",max,count);
    int count=CountRepeat(n);
    printf("%d",count);


}

