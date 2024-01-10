#include<stdio.h>
void main()
{
    int m,n;
    scanf("%d%d",&m,&n);
    int vector[m][n];
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            scanf("%d",&vector[i][j]);
        }
    }

    int x,y;
    scanf("%d%d",&x,&y);

    int sum=0;
    for(int j=0;j<n;j++){
        sum+=vector[x-1][j]*vector[y-1][j];
        //printf("%d x %d = %d\n",vector[x-1][j],vector[y-1][j],sum);
    }
    printf("%d ",sum);
}


