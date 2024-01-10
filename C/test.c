#include<stdio.h>
void main()
{
    int A[100];
    int i;
    int s=0;
    for(i=0;i<100;++i){
        A[i]=i;
        s=i+1;
    }

    for(i=0;i<3;++i){
        A[i]= s+A[(i*i)%100];
        s = s+A[2*i+1];
    }

    printf("%d\n", A[2]);
    printf("%d\n", A[3]);
    printf("%d\n", s);
}
