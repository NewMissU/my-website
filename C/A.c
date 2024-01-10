#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    char arr[(n-1)*2+1][(n-1)*2+1];
    for(int r=0;r<n;r++){
        for(int c=0;c<=(n-1)*2;c++){
            arr[r][c]=' ';
        }
    }

    for(int r=0;r<n;r++){
        for(int c=0;c<=(n-1)*2;c++){
            if(c==(n-1)-r){
                arr[r][c]='*';
            }
            else if(c==(n-1)+r){
                arr[r][c]='*';
            }
            for(int c1=n/2;c1<=(n/2)+n-1;c1++){
                if(r==n/2){
                    arr[r][c1]='*';
                }
            }
        }
    }

    for(int r=0;r<n;r++){
        for(int c=0;c<=(n-1)*2;c++){
            printf("%c",arr[r][c]);
        }
        printf("\n");
    }
}
