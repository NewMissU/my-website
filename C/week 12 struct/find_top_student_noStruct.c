#include<stdio.h>
void main()
{
    int n,k;
    scanf("%d%d",&n,&k);
    int score_Quiz[n][k];
    int max=0,winner_position=0;;
    for(int i=0;i<n;i++){
        int sum=0;
        for(int j=0;j<k;j++){
            scanf("%d",&score_Quiz[i][j]);
            sum+=score_Quiz[i][j];
        }
        if(sum>max){
            max=sum;
            winner_position=i;
        }
    }
    //printf("max : %d\nposition : %d\n",max,winner_position);
    printf("%d\n",max);

    //Find Count winner max quiz
    //set All winner_quiz = All win = 1
    int score[k];
    for(int j=0;j<k;j++){
        score[j]=1;
    }

   /* for(int j=0;j<k;j++){
        printf("Fixed : %d ",score[j]);
    }
    printf("\n");*/

    for(int j=0;j<k;j++){
        for(int i=0;i<n;i++){
            if(i != winner_position){
                if(score_Quiz[winner_position][j]<score_Quiz[i][j]){
                    score[j]=0;
                }
            }
        }
    }

    /*for(int j=0;j<k;j++){
        printf("New : %d ",score[j]);
    }
    printf("\n");*/

    int sum_score=0;
    for(int j=0;j<k;j++){
        if(score[j]!=0){
            sum_score++;
        }
    }
    //printf("sum : %d ",sum_score);
    printf("%d ",sum_score);
}
