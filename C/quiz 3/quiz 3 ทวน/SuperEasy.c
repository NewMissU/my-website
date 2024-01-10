#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        int x,y;
        scanf("%d%d",&x,&y);
        if(x<y){
            for(int j=x;j<=y;j++){
                printf("%d ",j);
            }
        }
        else if(x>y){
            for(int j=y;j<=x;j++){
                printf("%d ",j);
            }
        }
        printf("\n");
    }
}
