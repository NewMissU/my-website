#include<stdio.h>
/*typedef struct{
    int Q1;
    int Q2;
    int Q3;
} studentScore;*/

typedef struct{
    int Qscore[3];
}studentScore;

void main()
{
    /*studentScore s1;
    s1.Q1 = 5;
    s1.Q2 = 4;
    s1.Q3 = 5;
    printf("ID1 : %d %d %d\n",s1.Q1,s1.Q2,s1.Q3);

    studentScore s2;
    s2.Q1 = 3;
    s2.Q2 = 3;
    s2.Q3 = 3;
    printf("ID2 : %d %d %d",s2.Q1,s2.Q2,s2.Q3);*/



    studentScore students[3];
    students[0].Q1 = 5;
    students[0].Q2 = 4;
    students[0].Q3 = 5;
    students[1].Q1 = 3;
    students[1].Q2 = 3;
    students[1].Q3 = 3;
    students[2].Q1 = 1;
    students[2].Q2 = 2;
    students[2].Q3 = 3;
    for(int i=0;i<3;i++){
        printf("ID%d : %d %d %d\n",i,students[i].Q1,students[i].Q2,students[i].Q3);
    }
}
