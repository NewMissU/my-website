#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){
            if(r==0){
                printf("%d ",c%10);
            }
            else if(c==(n-1)-r){
                printf("%d ",((n+r)-1)%10);
            }
            else if(r==n-1){
                printf("%d ",((n*2)-2+c)%10);
            }
            else{
                printf("  ");
            }
        }
        printf("\n");
    }
}
