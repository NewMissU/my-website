#include<stdio.h>
void main()
{
    int mul;
    int x,y,n;
    scanf("%d%d%d",&x,&y,&n);
    if(x>y){
        for(int i=y;i<=x;i++){
            printf("%d: ",i);
        for(int j=1;j<=n;j++){
            mul=y*j;
            printf("%d ",mul);
        }
        y++;
        printf("\n");
        }
    }
    else if(x<y){
        for(int i=x;i<=y;i++){
                printf("%d: ",i);
            for(int j=1;j<=n;j++){
                mul=x*j;
                printf("%d ",mul);
            }
            x++;
            printf("\n");
        }
    }
}
