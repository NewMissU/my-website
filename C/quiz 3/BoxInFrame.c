#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
            printf("*");
        }
    printf("\n");
    printf("*");
    for(int j=1;j<=n-2;j++){
        printf(" ");
    }
    printf("*");
    printf("\n");
    for(int k=1;k<=n-4;k++){
        printf("* ");
        for(int l=1;l<=n-4;l++){
            printf("*");
        }
    printf(" *");
    printf("\n");
    }
    printf("*");
    for(int j=1;j<=n-2;j++){
        printf(" ");
    }
    printf("*");
    printf("\n");
    for(int i=1;i<=n;i++){
            printf("*");
        }
    printf("\n");
}

