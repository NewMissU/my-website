#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    int m;
    scanf("%d",&m);
    int vector[n][m];
    for(int r=0;r<n;r++){
        for(int c=0;c<m;c++){
            scanf("%d",&vector[r][c]);
        }
    }
    int x,y;
    scanf("%d%d",&x,&y);

    int vectorX[n][m];
    int vectorY[n][m];
    for(int r=0;r<n;r++){
        for(int c=0;c<m;c++){
                vectorX[r][c]=0;
                vectorY[r][c]=0;
            if(r==x-1){
                //printf("%d ",vector[r][c]);
                vectorX[x-1][c]=vector[r][c];
            }
            if(r==y-1){
                //printf("%d ",vector[r][c]);
                vectorY[y-1][c]=vector[r][c];
            }
        }
        //printf("\n");
    }

    int sumVectorXY[m];
    int ValueVectorXY=0;;
    for(int c=0;c<m;c++){
        sumVectorXY[c]=0;
        sumVectorXY[c]+=vectorX[x-1][c]*vectorY[y-1][c];
        ValueVectorXY+=sumVectorXY[c];
        //printf("(%d)(%d) ",vectorX[x-1][c],vectorY[y-1][c]);
        //printf("%d ",sumVectorXY[c]);
    }
    printf("%d ",ValueVectorXY);


}
