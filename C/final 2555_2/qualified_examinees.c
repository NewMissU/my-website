#include<stdio.h>
struct std_struct{
    char id[6]
}typedef std;

void main()
{
    int n;
    scanf("%d",&n);
    std student[n];
    double score[n];
    double sumScore=0;
    for(int i=0;i<n;i++){
        scanf("%s",student[i].id);
        scanf("%lf",&score[i]);
        sumScore+=score[i];
    }
    double avg = sumScore/n;
    //count pass
    //printf("avg : %.2lf\n",avg);
    int count=0;
    for(int i=0;i<n;i++){
        if(score[i]>avg){
            count++;
        }
    }
    printf("%d\n",count);
    //print
    for(int i=0;i<n;i++){
        if(score[i]>avg){
            printf("%s\n",student[i].id);
        }
    }
}
