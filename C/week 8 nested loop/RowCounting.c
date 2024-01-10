#include<stdio.h>
void main()
{
    int r,c;
    scanf("%d%d",&r,&c);
    int sum=r*c;
    int count=1; // นับเลข 1 - r*c
    for(int i=1;i<=r;i++){
        for(int j=1;j<=c;j++){
            printf("%d ",count);
            count++;
        }
    printf("\n");
    }

}
