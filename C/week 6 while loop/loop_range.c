#include<stdio.h>
void main()
{
    int x,y;
    scanf("%d%d",&x,&y);
    if (x<=y){
        while(x<=y){ // int i=x , n=y --> (i<=n)
        printf("%d ",x);
        x++;
        }
    }
    else if (x>y){ //else
        printf("Invalid input");
    }
}
