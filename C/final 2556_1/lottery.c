#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    int lottery[n];
    for(int i=0;i<n;i++){
        scanf("%d",&lottery[i]);
    }

    int k;
    scanf("%d",&k);
    int correct[k];
    for(int i=0;i<k;i++){
        scanf("%d",&correct[i]);
    }
    int count=0;
    int back3[n];
    for(int i=0;i<n;i++){
        back3[i]=lottery[i]%1000;
        for(int j=0;j<k;j++){
            if(back3[i]==correct[j]){
                count++;
            }
        }
    }
    printf("%d",count);

}
