#include<stdio.h>
struct {
    int id;
    char name[52];
    int score[5];
} typedef STUDENT;
STUDENT students[100];

void showAllScores(int countstudent){
    printf("Scores\n");
    for(int i=0;i<countstudent;i++){
        printf("%d ",students[i].id);
        printf("%s ",students[i].name);
        for(int j=0;j<5;j++){
            printf("%d ",students[i].score[j]);
        }
        printf("\n");
    }
}
void showAllGrades(int countstudent){
    printf("Grades\n");
    for(int i=0;i<countstudent;i++){
        printf("%d ",students[i].id);
        printf("%s ",students[i].name);
        for(int j=0;j<5;j++){
            if(students[i].score[j]>=80){
                printf("A ");
            }
            else if(students[i].score[j]>=70){
                printf("B ");
            }
            else if(students[i].score[j]>=60){
                printf("C ");
            }
            else if(students[i].score[j]>=50){
                printf("D ");
            }
            else if(students[i].score[j]<50){
                printf("F ");
            }
        }
        printf("\n");
    }
}
void showStudentScores(int countstudent){
    int id_card;
    scanf("%d",&id_card);
    for(int i=0;i<countstudent;i++){
        if(id_card==students[i].id){
            printf("%d ",students[i].id);
            printf("%s ",students[i].name);
            for(int j=0;j<5;j++){
                printf("%d ",students[i].score[j]);
            }
        printf("\n");
        }
    }
}
void showStudentGrade(int countstudent){
    int id_card;
    scanf("%d",&id_card);
    for(int i=0;i<countstudent;i++){
        if(id_card==students[i].id){
            printf("%d ",students[i].id);
            printf("%s ",students[i].name);
            for(int j=0;j<5;j++){
                if(students[i].score[j]>=80){
                    printf("A ");
                }
                else if(students[i].score[j]>=70){
                    printf("B ");
                }
                else if(students[i].score[j]>=60){
                    printf("C ");
                }
                else if(students[i].score[j]>=50){
                    printf("D ");
                }
                else if(students[i].score[j]<50){
                    printf("F ");
                }
            }
            printf("\n");
        }
    }
}
void cheangeName(int countstudent){
    int id_card;
    scanf("%d",&id_card);
    char New_name[52];
    scanf("%s",New_name);
    for(int i=0;i<countstudent;i++){
        if(id_card==students[i].id){
            for(int j=0;j<52;j++){
                students[i].name[j]=New_name[j];
            }
        }
    }
}
void changeScore(int countstudent){
    int id_card;
    scanf("%d",&id_card);
    int changePositionScore;
    scanf("%d",&changePositionScore);

    int NewScore;
    scanf("%d",&NewScore);

    for(int i=0;i<countstudent;i++){
        if(id_card==students[i].id){
            for(int j=0;j<5;j++){
                if(j==changePositionScore-1){
                    students[i].score[j]=NewScore;    // j-1 because changepositionscore = 2 but j start from 1 to 5 so j will be 3 when changescoreposition is 2
                }
            }
        }
    }
}

void main(){
    int countstudent=0;
    int command;
    for(int i=0;i<100;i++){
        scanf("%d",&students[i].id);
        if(students[i].id==0){
            break;
        }
        scanf("%s",students[i].name);
        for(int j=0;j<5;j++){
            scanf("%d",&students[i].score[j]);
        }
        countstudent++;
    }
    printf("Number of Students %d\n",countstudent);
    printf("Scores\n");
    for(int i=0;i<countstudent;i++){
        printf("%d ",students[i].id);
        printf("%s ",students[i].name);
        for(int j=0;j<5;j++){
            printf("%d ",students[i].score[j]);
        }
        printf("\n");
    }
    //printf("\n");
    printf("Grades\n");
    for(int i=0;i<countstudent;i++){
        printf("%d ",students[i].id);
        printf("%s ",students[i].name);
        for(int j=0;j<5;j++){
            if(students[i].score[j]>=80){
                printf("A ");
            }
            else if(students[i].score[j]>=70){
                printf("B ");
            }
            else if(students[i].score[j]>=60){
                printf("C ");
            }
            else if(students[i].score[j]>=50){
                printf("D ");
            }
            else if(students[i].score[j]<50){
                printf("F ");
            }
        }
        printf("\n");
    }


    while(1){
        scanf("%d",&command);
        if(command == 0){
            break;
        }
        else if(command == 1){
            showAllScores(countstudent);
            //printf("\n");
        }
        else if(command == 2){
            showAllGrades(countstudent);
            //printf("\n");
        }
        else if(command == 3){
            showStudentScores(countstudent);
            //printf("\n");
        }
        else if(command == 4){
            showStudentGrade(countstudent);
            //printf("\n");
        }
        else if(command == 5){
            cheangeName(countstudent);
            //printf("\n");
        }
        else if(command == 6){
            changeScore(countstudent);
            //printf("\n");
        }
        else{
            printf("please input 1,2,3,4,5,6,or 0\n");
        }
    }
}
