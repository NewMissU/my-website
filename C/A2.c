#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    for(int r=0;r<=n;r++){
        for(int c=0;c<=(n+1)+r;c++){
            if(c==n-r){
                printf("%d",r%10);
            }
            else if(c==n+r){
                printf("%d",r%10);
            }
            else if(r==n/2+1 && c>n/2-1 && c<n/2+n+1){
                printf("%d",r%10);
            }
            else{
                printf(" ");
            }
        }
        printf("\n");
    }


}

