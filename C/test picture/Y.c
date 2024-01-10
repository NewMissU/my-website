#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    if(n%2==0){
        //Y V
        for(int r=0;r<=n/2;r++){
            for(int c=0;c<=n;c++){
                if(r==c){
                    printf("%d",r);
                }
                else if(c==n-r){
                    printf("%d",r);
                }
                else{
                    printf(" ");
                }
            }
            printf("\n");
        }
        //Y I
        for(int r=n/2+1;r<=n;r++){
            for(int c=n/2;c<=n/2;c++){
                for(int i=0;i<n/2;i++){
                    printf(" ");
                }
                printf("%d",r);
            }
            printf("\n");
        }

    }
    else{
        //Y V
        for(int r=0;r<=n/2;r++){
            for(int c=0;c<=n;c++){
                if(r==c){
                    printf("%d",r);
                }
                else if(c==n-r-1){
                    printf("%d",r);
                }
                else{
                    printf(" ");
                }
            }
            printf("\n");
        }
        //Y I
        for(int r=n/2+1;r<=n;r++){
            for(int c=n/2;c<=n/2;c++){
                for(int i=0;i<n/2;i++){
                    printf(" ");
                }
                printf("%d",r);
            }
            printf("\n");
        }
    }

}
