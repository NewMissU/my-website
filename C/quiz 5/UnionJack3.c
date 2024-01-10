#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    char arr[n][n];

    //clean array
    for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){
            arr[r][c] = ' ';
        }
    }
    //top frame
    for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){
            arr[0][c]= '*';
        }
    }
    //bottom frame
    for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){
            arr[n-1][c]= '*';
        }
    }
    //left frame
    for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){
            arr[r][0]= '*';
        }
    }
    //right frame
    for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){
            arr[r][n-1]= '*';
        }
    }
    //vertical middle +
    for(int r=0;r<n;r++){
        for(int c=(n/2)-2;c<=(n/2)+2;c++){
            arr[r][c]= '*';
        }
    }

    //horizontal middle +
    for(int r=(n/2)-2;r<=(n/2)+2;r++){
        for(int c=0;c<n;c++){
            arr[r][c]= '*';
        }
    }

    //top left slope
    int count=0;
    for(int r=1;r<(n/2)-2;r++){
        for(int c=count;c<count+3;c++){
            arr[r][c]= '*';
        }
        count++;
    }

    //bottom right slope
    for(int r=(n/2)-2;r<n;r++){
        for(int c=count;c<count+3;c++){
            arr[r][c]= '*';
        }
        count++;
    }

    //top right slope
    int count2=n-1;
    for(int r=1;r<(n/2)-2;r++){
        for(int c=count2;c>count2-3;c--){
            arr[r][c]= '*';
        }
        count2--;
    }

    //bottom left slope
    for(int r=(n/2)-2;r<n;r++){
        for(int c=count2;c>count2-3;c--){
            arr[r][c]= '*';
        }
        count2--;
    }




    for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){
            printf("%c",arr[r][c]);
        }
        printf("\n");
    }

}
