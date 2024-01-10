#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    int a=1;
    if(n%3==0){
    for(int i=1;i<=n/3;i++){
        for(int i=1;i<=3;i++){
            for(int k=1;k<i;k++){
                printf(" ");
            }
            for(int j=1;j<=n/3;j++){
                printf("*  ");
            }
            printf("\n");
        }
    }
    }
}
