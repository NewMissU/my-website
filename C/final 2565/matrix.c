#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    int A[n][n];
    for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){
            scanf("%d",&A[r][c]);
        }
    }

    int B[n][n];
    for(int r=0;r<n;r++){
        for(int c=0;c<n;c++){
            scanf("%d",&B[r][c]);
        }
    }

    char operand[2];
    scanf("%s",operand);


    int sum[n][n];
    if(operand[0]=='+'){
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                sum[r][c]=0;
                sum[r][c]+=A[r][c]+B[r][c];
            }
        }

        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                printf("%d ",sum[r][c]);
            }
            printf("\n");
        }
    }

    else if(operand[0]=='-'){
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                sum[r][c]=0;
                sum[r][c]+=A[r][c]-B[r][c];
            }
        }

        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                printf("%d ",sum[r][c]);
            }
            printf("\n");
        }
    }

    else if(operand[0]=='*'){
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                sum[r][c]=0;
                sum[r][c]+=A[r][c]*B[c][r];
            }
        }

        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                printf("%d * %d = %d ",A[r][c],B[c][r],sum[r][c]);
                //printf("%d ",sum[r][c]);
            }
            printf("\n");
        }
    }


}
