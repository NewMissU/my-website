#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    char arr[n][n];
    for(int r=0;r<=n;r++){
        for(int c=0;c<=(n/2)+1;c++){
            arr[r][c]=' ';
        }
    }

    for(int r=0;r<=n;r++){
        for(int c=0;c<=(n/2)+1;c++){
            if(c==0){
                arr[r][c]='*';
            }
        for(int r=0;r<=n/2;r++){
            for(int c=1;c<=(n/2)+1;c++){
                if(c==n/2+1-r){
                    arr[r][c]='*';
                }
            }
        }
        int i=1;
        for(int r=n/2;r<=n;r++){
            for(int c=1;c<=(n/2)+1;c++){
                if(c==i){
                    arr[r][c]='*';
                }
            }
            i++;
        }
        }
    }


    for(int r=0;r<n;r++){
        for(int c=0;c<=(n/2)+1;c++){
            printf("%c ",arr[r][c]);
        }
        printf("\n");
    }
}
