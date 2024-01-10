#include<stdio.h>
void main()
{
    int m,n;
    scanf("%d%d",&m,&n);
    int k;
    scanf("%d",&k);
    char park[m][n];
    for(int r=0;r<m;r++){
        for(int c=0;c<n;c++){
            park[r][c]='_';
        }
    }

    int Row,Col;
    for(int i=0;i<k;i++){
        scanf("%d%d",&Row,&Col);
            park[Row-1][Col-1]='x';
    }

    for(int r=0;r<m;r++){
        for(int c=0;c<n;c++){
            printf("%c",park[r][c]);
        }
        printf("\n");
    }

}
