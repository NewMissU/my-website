#include<stdio.h>
struct data {
 int x[5];
 int y[10];
 int z;
} typedef Data;
int main() {
 Data A[5];
 for(int i = 0; i < 5; ++i) {
 for(int s = 0; s < 5; ++s) {
 A[i].x[s] = i + s;
 A[i].y[2*s] = A[i].x[s] + 1;
 A[i].y[2*s + 1] = A[i].y[s] + 1;
 }
 A[i].z = 30 - A[i].x[4];
 }

 for(int i = 0; i < 5; ++i) {
    for(int s = 0; s < 5; ++s) {
        printf("%d", A[4].x[4]);
        printf("%d", A[4].y[9]);
        printf("%d", A[4].y[9]);
    }
 }

 printf("\n%d\n", A[3].x[4]);
 printf("%d\n", A[4].y[9]);
}
