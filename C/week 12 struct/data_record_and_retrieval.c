#include<stdio.h>
struct student_card{
    char std_id[9];
    char name[31];
    char surname[51];
    int year;
}typedef std;

void main()
{
    int n;
    scanf("%d",&n);
    std s[n];
    for(int i=0;i<n;i++){
        scanf("%s",s[i].std_id);
        scanf("%s",s[i].name);
        scanf("%s",s[i].surname);
        scanf("%d",&s[i].year);
    }
    int y,count=0;
    scanf("%d",&y);
    for(int i=0;i<n;i++){
        if(y == s[i].year){
            printf("%s %s %s\n",s[i].std_id,s[i].name,s[i].surname);
            count++;
        }
    }
    if (count ==0){
        printf("None\n");
    }
}
