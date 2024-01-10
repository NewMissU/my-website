#include<stdio.h>
typedef struct
{
    int Quiz[5];
} score;

/*struct score_std{
    int Quiz[5+1];

}typedef score;*/

void main()
{
    int n,k;
    scanf("%d%d",&n,&k);
    score std[n];
    int max=0,winner=0;
    for(int i=0; i<n; i++)
    {
        int sum=0;
        for(int j=0; j<k; j++)
        {
            scanf("%d",&std[i].Quiz[j]);
            sum+=std[i].Quiz[j];
        }
        if(sum>max)
        {
            max=sum;
            winner=i;
        }
    }
    //printf("max : %d\n",max);
    printf("%d\n",max);

    score s = std[winner];
    int score[k];
    for(int i=0;i<k;i++){
        score[i]=1;
    }

    //check Fix value score[j]
    /*for(int j=0;j<k;j++){
        printf("fix: %d ",score[j]);
    }
    printf("\n");*/

    //check score each quiz
    for(int j=0; j<k; j++)  //check q(1) ---> q(n)
    {
        for(int i=0; i<n; i++)  // first --> final
        {
            if(i != winner)
            {
                if(s.Quiz[j]<std[i].Quiz[j])
                {
                    score[j]=0;
                }
            }
        }
    }

    //check
    /*for(int j=0;j<k;j++){
        for(int i=0;i<n;i++){
            printf("%d ",std[i].Quiz[j]);
        }
        printf("\n");
    }*/

    //check New value score[j]
    /*for(int j=0;j<k;j++){
        printf("new: %d ",score[j]);
    }
    printf("\n");*/

    //output count_winner_score
    int sum_score=0;
    for(int j=0; j<k; j++){
        if(score[j]!=0){
            sum_score++;
        }
    }
    //printf("sum_score : %d",sum_score);
    printf("%d",sum_score);
}
