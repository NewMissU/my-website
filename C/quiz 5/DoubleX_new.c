#include<stdio.h>
void main()
{
    int row,col;
    scanf("%d%d",&row,&col);
    char arr[row][col];
    for(int r=0;r<row;r++){
        for(int c=0;c<col;c++){
            arr[r][c]=' ';
        }
    }


    //first x
    for(int r=0;r<row;r++){
        for(int c=0;c<col;c++){
            if(r==c){
                arr[r][c]='*';
            }
            else if(c==(row-1)-r){
                arr[r][c]='*';
            }
        }
    }

    int distance=col-row;
    int count=0;
    //second x
    for(int r=0;r<row;r++){
        for(int c=distance;c<col;c++){
            if(c==distance+r){
                if(arr[r][c]=='*'){
                    count++;
                }
                arr[r][c]='#';
            }
            else if(c==(col-1)-r){
                if(arr[r][c]=='*'){
                    count++;
                }
                arr[r][c]='#';
            }
        }
    }



    for(int r=0;r<row;r++){
        for(int c=0;c<col;c++){
            printf("%c",arr[r][c]);
        }
        printf("\n");
    }
    printf("%d",count);
}
