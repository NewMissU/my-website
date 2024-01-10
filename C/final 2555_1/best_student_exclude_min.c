#include<stdio.h>
#include<limits.h>
struct student{
    char id[11];
    int Quiz[10];
}typedef STUDENT;

STUDENT std[1000];
void main()
{
    int max=INT_MIN;
    int n,t;
    scanf("%d%d",&n,&t);
    int sumQuiz[n];
    for(int i=0;i<n;i++){
        int min=INT_MAX;
        scanf("%s",std[i].id);
        sumQuiz[i]=0;
        for(int j=0;j<t;j++){
            scanf("%d",&std[i].Quiz[j]);
            sumQuiz[i]+=std[i].Quiz[j];
            if(std[i].Quiz[j]<min){
                min=std[i].Quiz[j];
            }
        }
        sumQuiz[i]-=min;
        if(sumQuiz[i]>max){
            max=sumQuiz[i];
        }
        //printf("sum%d : %d\n",i+1,sumQuiz[i]);
        //printf("max : %d\n",max);
        //printf("min : %d\n",min);

    }
    int MaxScore=max;
    printf("%d\n",MaxScore);
    for(int i=0;i<n;i++){
        if(sumQuiz[i]==max){
            printf("%s\n",std[i].id);
        }
    }

}
