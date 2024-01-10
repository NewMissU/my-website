#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    char arr[n][n];
    //clean array
    for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){
            arr[r][c]=' ';
        }
    }
    //vertical
    for(int r=0;r<n;r++){
        for(int c=n/2;c<n/2+1;c++){
            arr[r][c]='*';
        }
    }

    //horizontal
    for(int r=n/2;r<n/2+1;r++){
        for(int c=0;c<n;c++){
            arr[r][c]='*';
        }
    }

    //slope left
    for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){
            if(r==c){
                arr[r][c]='*';
            }
        }
    }

    //slope right
    int value_n=n-1;
    for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){
            if(c==value_n){
                arr[r][c]='*';
            }
        }
        value_n--;
    }


    for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){
            printf("%c",arr[r][c]);
        }
        printf("\n");
    }
}
