#include<stdio.h>
void main()
{
    int nRow,nCol;
    scanf("%d%d",&nRow,&nCol);
    char arr[nRow][nCol];
    // initialization
    for(int r=0;r<nRow;r++){
        for(int c=0;c<nCol;c++){
            arr[r][c] = '_';
        }
    }
    //assign x
    arr[0][0] = 'x';
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        int x,y;
        scanf("%d%d",&x,&y);    //ใส่ ตำแหน่งไหนไป ก็จะให้= x
        arr[x-1][y-1] = 'x';
    }
    // output
    for(int r=0;r<nRow;r++){
        for(int c=0;c<nCol;c++){
            printf("%c",arr[r][c]);
        }
        printf("\n");
    }
}

