#include<stdio.h>
#include<limits.h>
int max=INT_MIN;
int CountRepeat(int* arData, int n){
    //loop count
    int count=0;
    for(int i=0;i<n;i++){
        if(arData[i]>max){
            max=arData[i];
            count=1;
        }
        else if(arData[i]==max){
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
    int arData[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arData[i]);
    }
    int count=CountRepeat(arData,n);
    printf("%d",count);


}

