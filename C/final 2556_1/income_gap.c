#include<stdio.h>
#include<limits.h>
void main()
{
    int n;
    scanf("%d",&n);
    int group[n][5];
    for(int i=0;i<n;i++){
        for(int j=0;j<5;j++){
            scanf("%d",&group[i][j]);
        }
    }

    // find max min each other group
    int gap[n];
    int max2=INT_MIN,min2=INT_MAX;
    for(int i=0;i<n;i++){
        int max=INT_MIN,min=INT_MAX;
        for(int j=0;j<5;j++){
            if(group[i][j]>max){
                max=group[i][j];
            }
            if(group[i][j]<min){
                min=group[i][j];
            }
        }
        gap[i]=max-min;
        if(gap[i]>max2){
            max2=gap[i];
        }
        if(gap[i]<min2){
            min2=gap[i];
        }
    }
    printf("%d %d %d ",max2,min2,max2-min2);


}
