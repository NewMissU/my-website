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
    //vertical 1
    for(int r=0;r<n;r++){
        for(int c=n/3;c<(n/3)+1;c++){
            arr[r][c]='#';
        }
    }
    //vertical 2
    for(int r=0;r<n;r++){
        for(int c=(n*2)/3;c<((n*2)/3)+1;c++){
            arr[r][c]='#';
        }
    }

    //horizontal 1
    for(int r=n/3;r<(n/3)+1;r++){
        for(int c=0;c<n;c++){
            arr[r][c]='#';
        }
    }

    //horizontal 2
    for(int r=(n*2)/3;r<((n*2)/3)+1;r++){
        for(int c=0;c<n;c++){
            arr[r][c]='#';
        }
    }





    for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){
            printf("%c",arr[r][c]);
        }
        printf("\n");
    }
}
