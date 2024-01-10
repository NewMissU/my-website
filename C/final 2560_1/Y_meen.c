#include<stdio.h>
void main(){
    int n;
    scanf("%d",&n);

    // Y for V
    if(n%2==0){ // even
        for(int r=0;r<=n/2;r++){
            for(int c=0;c<=n;c++){
                if(r==c){
                    printf("%d",r);
                }else if(r+c==n){
                    printf("%d",r);
                }else{
                    printf(" ");
                }
            }
            printf("\n");
        }

        // Y for I
        for(int r=(n/2)+1;r<=n;r++){
            for(int c=0;c<n/2;c++){
                printf(" ");
            }
            printf("%d\n",r);
        }
    }else{ // odd
        for(int r=0;r<=n/2;r++){
            for(int c=0;c<=n;c++){
                if(r==c){
                    printf("%d",r);
                }else if(r+c==n-1){
                    printf("%d",r);
                }else{
                    printf(" ");
                }
            }
            printf("\n");
        }

        // Y for I
        for(int r=(n/2)+1;r<=n;r++){
            for(int c=0;c<n/2;c++){
                printf(" ");
            }
            printf("%d\n",r);
        }
    }
}
