#include<stdio.h>
typedef struct{
    int q1;
    int q2;
    int q3;
} studentScore;

void main(){
    studentScore s1;
    s1.q1=5;
    s1.q2=4;
    s1.q3=5;
    //printf("ID1 %d %d %d\n",s1.q1,s1.q2,s1.q3);

    studentScore s2;
    s2.q1=3;
    s2.q2=3;
    s2.q3=3;
    //printf("ID2 %d %d %d\n",s2.q1,s2.q2,s2.q3);

    //int arr[size];
    //arr[0]=??;
    //arr[1]=??;
    studentScore students[3];
    students[0].q1=5;
    students[0].q2=4;
    students[0].q3=5;
    students[1].q1=3;
    students[1].q2=3;
    students[1].q3=3;
    students[2].q1=1;
    students[2].q2=2;
    students[2].q3=3;
    for(int i=0;i<3;i++){
        printf("ID%d %d %d %d\n",i+1
               ,students[i].q1,students[i].q2,students[i].q3);
    }
}

