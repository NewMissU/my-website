#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    int std[n];
    for(int i=0;i<n;i++){
        scanf("%d",&std[i]);
    }

    int diffRight[n];
    int diffLeft[n];
    int countError=0;
    int Errorstd[n];
    for(int i=0;i<n;i++){
        diffRight[i]=0;
        diffLeft[i]=0;
        std[-1]=0;
        diffRight[i]=std[i+1]-std[i];
        diffLeft[i]=std[i]-std[i-1];
        printf("diffRight : %d\ndiffLeft : %d\n",diffRight[i],diffLeft[i]);
        if(diffLeft[i] == 1 || diffRight[i] == 1){
            Errorstd[countError]=std[i];
            countError++;
        }
        printf("count : %d\n",countError);
    }

    if(countError >0){
        printf("Found %d error, ",countError);
        for(int i=0;i<countError;i++){
            printf("%d ",Errorstd[i]);
        }
    }
    else {
        printf("Not found Error");
    }
}
