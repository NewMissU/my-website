#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    int d=n;
    for(int i=1;i<=n;i++){
        for(int k=1;k<i;k++){
            printf(" ");
        }
        for(int j=1;j<=d;j++){
            printf("%d",d%10);
        }
        d--;
        printf("\n");
    }
}
