#include<stdio.h>
struct scoreTest{
    char id[6];
    double score;
}typedef test;

void main()
{
    int n;
    scanf("%d",&n);
    test p[n];
    double sum=0;
    for(int i=0;i<n;i++){
        scanf("%s",p[i].id);
        scanf("%lf",&p[i].score);
        sum+=p[i].score;
    }
    double avg;
    avg = sum/n;
    //printf("%lf",avg);

    int count=0;
    for(int i=0;i<n;i++){
        if(p[i].score>avg){
            count++;
        }
    }
    printf("%d\n",count);

    for(int i=0;i<n;i++){
        if(p[i].score>avg){
            printf("%s\n",p[i].id);
        }
    }
}
