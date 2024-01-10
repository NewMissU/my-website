#include<stdio.h>
void main()
{
    int w,n;
    scanf("%d%d",&w,&n);
    for(int i=1;i<=((w+1)*n)+1;i++){ // 1
        printf("*");
    }
    printf("\n");
    for(int i=1;i<=n;i++){      // 2
            printf("*");
        for(int j=1;j<=w;j++){
            printf(" ");
        }
    }
    printf("*");
    printf("\n");
    for(int i=1;i<=((w+1)*n)+1;i++){ // 3
        printf("*");
    }
}
