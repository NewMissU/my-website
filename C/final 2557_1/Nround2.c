#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){
            //left
            if(c==0){
                printf("%d ",(n-r)%10);
            }
            //middle
            else if(r==c){
                printf("%d ",(n+r)%10);
            }
            //right
            else if(c==n-1){
                printf("%d",(((n*3)-2)-r)%10);
            }
            else{
                printf("  ");
            }
        }
        printf("\n");
    }
}
