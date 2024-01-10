#include<stdio.h>
struct student{
    char id[11];
    char branch[3];
    double QuizScore;
    double midScore;
    double finalScore;
    double sumScore;

}typedef STUDENT;

struct section{
    char groupNumber[3];
    int amountMember;
    STUDENT std[100];
}typedef GROUP;

GROUP group[5];

void main(){
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        scanf("%s",group[i].groupNumber);
        scanf("%d",&group[i].amountMember);
        for(int j=0;j<group[i].amountMember;j++){
            group[i].std[j].sumScore=0;
            scanf("%s",group[i].std[j].id);
            scanf("%s",group[i].std[j].branch);
            for(int p=0;p<5;p++){
                scanf("%lf",&group[i].std[j].QuizScore);
                group[i].std[j].sumScore+=group[i].std[j].QuizScore*(5.00/100);
            }
            scanf("%lf",&group[i].std[j].midScore);
            scanf("%lf",&group[i].std[j].finalScore);
            group[i].std[j].sumScore+=group[i].std[j].midScore+group[i].std[j].finalScore;
        }
    }

    double avg=0,scoreAllstudent=0,allMember=0;
    for(int i=0;i<n;i++){
            allMember+=group[i].amountMember;
        for(int j=0;j<group[i].amountMember;j++){
            scoreAllstudent+=group[i].std[j].sumScore;
        }
    }
    avg=scoreAllstudent/allMember;
    char command;
    while(1){
        scanf("%c", &command);
        if(command == 's'){
            for(int i=0;i<n;i++){
                printf("%s\n",group[i].groupNumber);
                for(int j=0;j<group[i].amountMember;j++){
                    printf("%s ",group[i].std[j].id);
                    printf("%s ",group[i].std[j].branch);
                    printf("%.2lf ",group[i].std[j].sumScore);
                    printf("\n");
                }
            }
        }
        if(command == 'a'){
            printf("average score = %.2lf\n",avg);
        }
        if(command == 'p'){
            int pass=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<group[i].amountMember;j++){
                    if(group[i].std[j].sumScore>=avg){
                        pass++;
                    }
                }
            }
            printf("pass = %d out of %.0lf\n",pass,allMember);
        }
        if(command == 'e'){
            break;
        }
    }
}

