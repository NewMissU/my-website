#include<stdio.h>
int A[1000][1000];
void main(){
    for(int row = 0; row < 1000; ++row) {
        for(int col = 0; col < 1000; ++col) {
            A[row][col] = 1;
        }
    }
    int sum1 = 0;
    int sum2 = 0;
    for(int row = 0; row < 1000; ++row) {
        for(int col = 0; col < 1000; ++col) {
            int p = row - 50; int q = col - 40;
            if(p < 0) {
                p = 0;
            }
            if(q < 0) {
                q = 0;
            }
            A[row][col] = A[p][q] +2;
            sum1 += 1;
        }
    sum2 -= 2;
    }
    printf("%d\n",sum1+sum2);
    printf("%d\n",A[20][3]);
    printf("%d\n",A[700][800]);
    printf("%d\n",A[801][90]);
}
