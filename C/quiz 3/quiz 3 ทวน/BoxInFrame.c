#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    for(int i=1;i<=n;i++){  // 1
        printf("*");
    }
    printf("\n");
    printf("*");
    for(int i=1;i<=n-2;i++){    // 2
        printf(" ");
    }
    printf("*");
    printf("\n");
    for(int j=3;j<=n-2;j++){            //middle
        printf("* ");
            for(int i=1;i<=n-4;i++){
                printf("*");
            }
        printf(" *");
        printf("\n");
    }
    printf("*");
    for(int i=1;i<=n-2;i++){        //2
        printf(" ");
    }
    printf("*");
    printf("\n");
    for(int i=1;i<=n;i++){      //1
        printf("*");
    }
}
