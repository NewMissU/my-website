#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    int value=0;
    if(n%2==0){
        value=n-1;
    }
    else{
        value=n-2;
    }
    //top7
    for(int r=0;r<=n/2;r++){
        for(int c=0;c<=n;c++){
            if(r==c){
                printf("%d",r);
            }
            else if(c==n-r){
                printf("%d",r);
            }
            printf(" ");
        }
        printf("\n");
    }

    /*for(int r=(n/2)+1;r<=n;r++){
        for(int c=0;c<=n;c++){
            if(r==c){
                printf("%d",r);
            }
        }
        printf("\n");
    }*/
}
