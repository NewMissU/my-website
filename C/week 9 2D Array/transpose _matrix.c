#include<stdio.h>
void main()
{
    int nR,nC;
    scanf("%d%d",&nR,&nC);
    int x[nR][nC];
        for(int r=0;r<nR;r++){     //row
            for(int c=0;c<nC;c++){     //col
                scanf("%d",&x[r][c]);
                //printf("%d ",x[r][c]);
                //printf("%d %d ",r,c);
            }
        }

        for(int c=0;c<nC;c++){     //col
            for(int r=0;r<nR;r++){     //row
                printf("%d ",x[r][c]);
            }
            printf("\n");
        }
}
