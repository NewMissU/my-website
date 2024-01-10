#include<stdio.h>
void main()
{
    int r,c;
    scanf("%d%d",&r,&c);
    int x[r][c];
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            scanf("%d",&x[i][j]);
        }
    }
    //share zone
    int sum1=0,sum2=0,sum3=0,sum4=0;    //2 4
    for(int i=0;i<r/2;i++){
        for(int j=0;j<c/2;j++){
            sum1+=x[i][j];
        }
    }

    for(int i=0;i<r/2;i++){
        for(int j=c/2;j<c;j++){
            sum2+=x[i][j];
        }
    }

    for(int i=r/2;i<r;i++){
        for(int j=0;j<c/2;j++){
            sum3+=x[i][j];
        }
    }

    for(int i=r/2;i<r;i++){
        for(int j=c/2;j<c;j++){
            sum4+=x[i][j];
        }
    }

    printf("%d %d\n%d %d",sum1,sum2,sum3,sum4);
}
