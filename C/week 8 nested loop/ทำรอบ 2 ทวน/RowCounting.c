#include<stdio.h>
void main()
{
    int r,c;
    scanf("%d%d",&r,&c);
    int x=1;
    for(int i=1;i<=r;i++){
        for(int j=1;j<=c;j++){
            printf("%d ",x);
            x++;
        }
        printf("\n");
    }
}
