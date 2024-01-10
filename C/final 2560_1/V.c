#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    for(int r=0;r<=n;r++){
        for(int c=0;c<=(n*2);c++){
            if(r==c){
                printf("%d",r);
            }
            else if(c==(n*2)-r){
                printf("%d",r);
            }
            else{
                printf(" ");
            }
        }
        printf("\n");
    }
}
