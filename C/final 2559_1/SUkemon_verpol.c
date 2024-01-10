#include <stdio.h>

void main()
{
    int n;
    scanf("%d",&n);
    int A[n];
    int B[n];
    for(int i=0;i<n;i++){
        scanf("%d",&A[i]);
    }
    for(int i=0;i<n;i++){
        scanf("%d",&B[i]);
    }
    int cntA=0,cntB=0;
    for(;;){
        if(A[cntA]>B[cntB]){
            A[cntA]-=B[cntB];
            cntB++;
            printf("1\n");
        }
        else if(A[cntA]<B[cntB]){
            B[cntB]-=A[cntA];
            cntA++;
            printf("2\n");
        }
        else if(A[cntA]==B[cntB]){
            cntA++;
            cntB++;
            printf("0\n");
        }
        if(cntA==n&&cntB==n){
            break;
        }
        else if(cntA==n){
            break;
        }
        else if(cntB==n){
            break;
        }
    }
}
