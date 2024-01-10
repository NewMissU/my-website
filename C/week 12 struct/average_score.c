#include<stdio.h>
struct scoreTest{
    double score;
}typedef test;

void main()
{
    int n;
    scanf("%d",&n);
    test p[n];
    double sum=0;
    for(int i=0;i<n;i++){
        scanf("%lf",&p[i].score);
        sum+=p[i].score;
    }
    double avg;
    avg = sum/n;
    printf("%lf",avg);
}
