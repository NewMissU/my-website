#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    char arr[n][n];

    //clear array
    for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){
            arr[r][c]=' ';
        }
    }

    //upper frame
    for(int c=0;c<n;c++){
        arr[0][c]='*';
    }

    //left side frame
    for(int r=1;r<n;r++){
        arr[r][0]='*';
    }

    //right side frame
    for(int r=1;r<n;r++){
        arr[r][n-1]='*';
    }

    //lower frame
    for(int c=0;c<n;c++){
        arr[n-1][c]='*';
    }

    //middle vertical
    for(int c=(n/2)-2;c<=(n/2)+2;c++){
        for(int r=0;r<n;r++)
        arr[r][c]='*';
    }

    //middle horizontal
    for(int c=(n/2)-2;c<=(n/2)+2;c++){
        for(int r=0;r<n;r++)
        arr[c][r]='*';
    }

    int count1=0;
    //top left slope
    for(int r=1;r<(n/2)-2;r++){
        for(int c=count1;c<count1+3;c++){
            arr[r][c]='*';
        }
        count1++;
    }

    //bottom right slope
    for(int r=(n/2)-2;r<n-1;r++){
        for(int c=count1;c<count1+3;c++){
            arr[r][c]='*';
        }
        count1++;
    }

    //top right slope
    int count2=n-1;
    for(int r=1;r<(n/2)-2;r++){
        for(int c=count2;c>count2-3;c--){
            arr[r][c]='*';
        }
        count2--;
    }

    //bottom left slope
    for(int r=(n/2)-2;r<n-1;r++){
        for(int c=count2;c>count2-3;c--){
            arr[r][c]='*';
        }
        count2--;
    }

    //print
    for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){
            printf("%c",arr[r][c]);
        }
        printf("\n");
    }
}
