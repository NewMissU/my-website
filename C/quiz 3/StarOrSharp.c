#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        int x;
        scanf("%d",&x);
        if(x%2==0){
            for(int j=1;j<=x;j++){
                printf("#");
            }
        }
        else{
            for(int k=1;k<=x;k++){
                printf("*");
            }
        }
        printf("\n");
    }
}
