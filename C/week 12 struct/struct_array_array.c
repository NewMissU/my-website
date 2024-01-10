#include<stdio.h>
typedef struct{
    int qscore[3];
} studentScore;

void main(){
    studentScore s1;
    s1.qscore[0]=5;
    s1.qscore[1]=4;
    s1.qscore[2]=5;
    printf("ID1 %d %d %d\n"
           ,s1.qscore[0],s1.qscore[1],s1.qscore[2]);

    studentScore students[3];
    students[0].qscore[0]=5;
    students[0].qscore[1]=4;
    students[0].qscore[2]=5;
    students[1].qscore[0]=3;
    students[1].qscore[1]=3;
    students[1].qscore[2]=3;
    students[2].qscore[0]=1;
    students[2].qscore[1]=2;
    students[2].qscore[2]=3;
    for(int i=0;i<3;i++){
        printf("ID%d",i+1);
        for(int j=0;j<3;j++){
        printf(" %d",students[i].qscore[j]);
        }
    printf("\n");
    }
}

