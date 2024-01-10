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
    //frame upper
    for(int r=0;r<1;r++){
        for(int c=0;c<n;c++){
            printf("*",arr[r][c]);
        }
        printf("\n");
    }
//--------------------------------------------------------------------------
    /*//* (sum +)
    for(int r=0;r<n;r++){
        for(int c=((n-5)/2)+1;c<((n-5)/2)+6;c++){
            printf("+");
        }
        printf("\n");
    }*/


    //frame inside test
    for(int r=0;r<n-2;r++){
        printf("*");
        for(int c=1;c<((n-5)/2);c++){   // spacebar left
            printf("/",arr[r][c]);
        }
        for(int c=((n-5)/2)+1;c<((n-5)/2)+6;c++){    // + middle
            printf("+",arr[r][c]);
        }
        for(int c=((n-5)/2)+6;c<n;c++){    // spacebar right
            printf("/",arr[r][c]);
        }
        printf("*");
        printf("\n");
    }
//--------------------------------------------------------------------------
    //Upper Vertical + correct
    /*for(int r=0;r<((n-5)/2)-1;r++){
        printf("*");
        for(int c=1;c<((n-5)/2);c++){   // spacebar left
            printf("/",arr[r][c]);
        }
        for(int c=((n-5)/2)+1;c<((n-5)/2)+6;c++){    // + middle
            printf("+",arr[r][c]);
        }
        for(int c=((n-5)/2)+6;c<n;c++){    // spacebar right
            printf("/",arr[r][c]);
        }
        printf("*");
        printf("\n");
    }*/

    //Upper Vertical + test slope
    /*int value_N=n;
    for(int r=0;r<((n-5)/2)-1;r++){
        printf("*");
        for(int c=1;c<)

        for(int c=1;c<((n-5)/2);c++){   // spacebar left
            printf("/",arr[r][c]);
        }
        for(int c=((n-5)/2)+1;c<((n-5)/2)+6;c++){    // + middle
        printf("+",arr[r][c]);
        }
        for(int c=((n-5)/2)+6;c<n;c++){    // spacebar right
            printf("/",arr[r][c]);
        }
        printf("*");
        printf("\n");
        /*for(int c=((n-5)/2)+1;c<((n-5)/2)+6;c++){    // + middle
            printf("+",arr[r][c]);
        }
        for(int c=((n-5)/2)+6;c<n;c++){    // spacebar right
            printf("_",arr[r][c]);
        }
        printf("*");
        printf("\n");
    }*/
//--------------------------------------------------------------------------
    printf("\n");
    //Middle Horizontal +
    for(int r=((n-5)/2)+1;r<((n-5)/2)+6;r++){
        printf("*");
        for(int c=1;c<n-1;c++){
            printf("+");
        }
        printf("*");
        printf("\n");
    }
    printf("\n");
//--------------------------------------------------------------------------
    //printf("\n");
    //Lower Vertical +
    for(int r=((n-5)/2)+6;r<n;r++){
        printf("*");
        for(int c=1;c<((n-5)/2);c++){   // spacebar left
            printf("/",arr[r][c]);
        }
        for(int c=((n-5)/2)+1;c<((n-5)/2)+6;c++){    // + middle
            printf("+",arr[r][c]);
        }
        for(int c=((n-5)/2)+6;c<n;c++){    // spacebar right
            printf("/",arr[r][c]);
        }
        printf("*");
        printf("\n");
    }

    //frame sider
    /*for(int r=0;r<n-2;r++){
        printf("*");
        for(int c=1;c<n-1;c++){
            printf(" ",arr[r][c]);
        }
        printf("*");
        printf("\n");
    }*/



//--------------------------------------------------------------------------
    //printf("\n");
    //frame lower
    for(int r=n;r>n-1;r--){
        for(int c=0;c<n;c++){
            printf("*",arr[r][c]);
        }
    }

}
