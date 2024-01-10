#include<stdio.h>
void main()
{
    int nRow,nCol;
    scanf("%d%d",&nRow,&nCol);
    char arr[nRow+1][nCol+1];       // start (1,1)
    // initialization
    for(int r=1;r<=nRow;r++){
        for(int c=1;c<=nCol;c++){
            arr[r][c] = '_';
        }
    }
    //assign x
    arr[0][0] = 'x';
    int n;
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        int x,y;
        scanf("%d%d",&x,&y);    //ใส่ ตำแหน่งไหนไป ก็จะให้= x
        arr[x][y] = 'x';
    }
    // output
    for(int r=1;r<=nRow;r++){
        for(int c=1;c<=nCol;c++){
            printf("%c",arr[r][c]);
        }
        printf("\n");
    }
}
