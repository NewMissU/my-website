#include<stdio.h>
struct student_card{
    char id[9];
    char name[31];
    char surname[51];
    double GPA;
}typedef std;

void main()
{
    int n;
    scanf("%d",&n);
    std s[n];
    for(int i=0;i<n;i++){
        scanf("%s%s%s%lf",s[i].id,s[i].name,s[i].surname,&s[i].GPA);
    }
    double maxGPA=0;
    int max_position=0;
    for(int i=0;i<n;i++){
        if(s[i].GPA>maxGPA){
            maxGPA=s[i].GPA;
            max_position=i;
        }
    }
    printf("%s %s %s %.2lf",s[max_position].id,s[max_position].name,
                            s[max_position].surname,s[max_position].GPA);
}
