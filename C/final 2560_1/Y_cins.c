#include<stdio.h>
void main()
{
    int N;
    scanf("%d",&N);
    if(N%2!=0){
        for(int i=0;i<N/2;i++){
            for(int j=0;j<N;j++){
                if(i==j){
                    printf("%d",j);
                }
                else if(i+j==N-1){
                    printf("%d",i);
                }
                else{
                    printf(" ");
                }
            }
            printf("\n");
        }
    }
    else{
    for(int i=0;i<N/2;i++){
            for(int j=0;j<N;j++){
                if(i==j){
                    printf("%d ",j);
                }
                else if(i+j==N-1){
                    printf("%d",i);
                }
                else{
                    printf(" ");
                }
            }
            printf("\n");
        }
    }
    for(int i=N/2;i<=N;i++){
        for(int j=0;j<N/2;j++){
            printf(" ");
        }
        printf("%d\n",i);
    }
}
