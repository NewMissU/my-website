#include<stdio.h>
void main()
{
    int scoreX=0,scoreY=0;
    int n;
    scanf("%d",&n);
    int x[n];
    int y[n];
    for(int i=0;i<n;i++){
        scanf("%d",&x[i]);
    }
    for(int i=0;i<n;i++){
        scanf("%d",&y[i]);
    }
    for(int i=0;i<n;i++){
        if(x[i]>y[i]){
            scoreX+=2;
            scoreY+=0;
        }
        else if(x[i]<y[i]){
            scoreX+=0;
            scoreY+=2;
        }
        else if(x[i]==y[i]){
            scoreX+=1;
            scoreY+=1;
        }
    }
        if(scoreX>scoreY){
            printf("Team 1 wins\n");
            printf("Score %d to %d",scoreX,scoreY);
        }
        else if(scoreX<scoreY){
            printf("Team 2 wins\n");
            printf("Score %d to %d",scoreY,scoreX);
        }
        else{
            printf("Draw game\n");
            printf("Score %d to %d",scoreX,scoreY);
        }
}
