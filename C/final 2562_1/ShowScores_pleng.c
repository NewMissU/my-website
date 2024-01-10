#include<stdio.h>
typedef struct
{
    char name[10];
    double score[100];
    double sum_score;
} ShowScores;

void main(){
    int n,k;
    scanf("%d %d",&n,&k);
    ShowScores a[100];
    for(int i=0 ; i<n ; i++){
        scanf("%s",a[i].name);
    }

    for(int i=0 ; i<n ; i++){
        for(int j=0 ; j<k ; j++){
            scanf("%lf",&a[i].score[j]);
        }
    }
    printf("\n");
    for(int i=0 ; i<n ; i++){
        a[i].sum_score = 0;
        for(int j=0 ; j<k ; j++){
            printf("%.0lf ",a[j].score[i]);
            a[i].sum_score += a[j].score[i];
        }
        printf("= %.0lf ",a[i].sum_score);
        printf("\n");
    }
   /* for(int i=0 ; i<n ; i++){
        printf("%s %.2lf",a[i].name, a[i].sum_score);
        printf("\n");
    }*/

}
