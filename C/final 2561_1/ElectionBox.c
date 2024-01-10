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
    //top frame
    for(int r=0;r<1;r++){
        for(int c=0;c<n;c++){
            arr[r][c]='*';
        }
    }
    //side frame
    for(int r=0;r<n;r++){
        for(int c=0;c<1;c++){
            arr[r][c]='*';
        }
    }

    for(int r=0;r<n;r++){
        for(int c=n-1;c<n;c++){
            arr[r][c]='*';
        }
    }
    //bottom frame
    for(int r=n-1;r<n;r++){
        for(int c=0;c<n;c++){
            arr[r][c]='*';
        }
    }

    //slope
    for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){
            if(r==c){
                arr[r][c]='*';
            }
        }
    }
    int value_n=n-1;
    for(int r=0;r<n;r++){
        for(int c=n-1;c>0;c--){
            if(c==value_n){
                arr[r][c]='*';
            }
        }
        value_n--;
    }

    //output
    for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){
            printf("%c",arr[r][c]);
        }
        printf("\n");
    }


}
