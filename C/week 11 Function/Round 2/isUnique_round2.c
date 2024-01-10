#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    int arData[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arData[i]);
    }

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

    printf("%d",isUnique);
}
