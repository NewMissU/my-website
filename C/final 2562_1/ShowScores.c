#include<stdio.h>
struct STUDENT{
    char id[11];
}typedef student;

void main()
{
    int n;
    scanf("%d",&n);
    int k;
    scanf("%d",&k);

    student std[n];
    for(int c=0;c<n;c++){
        scanf("%s",std[c].id);
    }

    int score[k][n];
    for(int r=0;r<k;r++){   //row
        for(int c=0;c<n;c++){   //col
            scanf("%d",&score[r][c]);
        }
    }

    //calculate
    double sumScore[n],avg[n];
    for(int c=0;c<n;c++){
        //clean
        sumScore[c]=0;
        avg[c]=0;
        for(int r=0;r<k;r++){
            sumScore[c]+=score[r][c];
        }
        //printf("%.2lf ",sumScore[c]);
        avg[c]=sumScore[c]/k;
        printf("%s ",std[c].id);
        printf("%.2lf",avg[c]);
        printf("\n");
    }
}

