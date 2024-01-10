#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){
            //top
            if(r==0){
                printf("%d ",c%10);
            }
            //bottom
            else if(r==n-1){
                printf("%d ",((((n*2)-2)+c)%10));
            }
            //middle
            else if(c==(n-r)-1){
                printf("%d",((n+r)-1)%10);
            }
            else{
                printf("  ");
            }
        }
        printf("\n");
    }
}
