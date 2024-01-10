#include<stdio.h>
void main()
{
    int scoret1=0,scoret2=0;
    int n;
    scanf("%d",&n);
    int t1[n],t2[n];
    for(int i=0;i<n;i++){
        scanf("%d",&t1[i]);
    }
    for(int i=0;i<n;i++){
        scanf("%d",&t2[i]);
    }
    for(int i=0;i<n;i++){
        if(t1[i]>t2[i]){
            scoret1+=2;
        }
        else if(t1[i]<t2[i]){
            scoret2+=2;
        }
        else if(t1[i]==t2[i]){
            scoret1+=1;
            scoret2+=1;
        }
    }
    if(scoret1>scoret2){
        printf("Team 1 wins\n");
        printf("Score %d to %d",scoret1,scoret2);
    }
    else if(scoret1<scoret2){
        printf("Team 2 wins\n");
        printf("Score %d to %d",scoret2,scoret1);
    }
    else if(scoret1==scoret2){
        printf("Draw game\n");
        printf("Score %d to %d",scoret2,scoret1);
    }
}
