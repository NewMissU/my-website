#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        int x;
        scanf("%d",&x);
        if(x%2==0){
            for(int i=1;i<=x;i++){
                printf("#");
            }
        }
        else{
            for(int i=1;i<=x;i++){
                printf("*");
            }
        }
        printf("\n");
    }
}
