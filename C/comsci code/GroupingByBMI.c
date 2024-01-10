#include<stdio.h>
void main()
{
    float under=0,normal=0,over=0,obe=0;
    float per_under=0,per_normal=0,per_over=0,per_obe=0;
    float av_under=0,av_normal=0,av_over=0,av_obe=0;
    float all_under=0,all_normal=0,all_over=0,all_obe=0;
    int N;
    scanf("%d",&N);
    float bmi=0;
    for(int i=1;i<=N;i++){
        float w,h,hm;
        scanf("%f%f",&w,&h);
        hm=h/100;
        bmi=w/(hm*hm);
        //printf("bmi = %.2f ",bmi);
        if(bmi<18.5){
            under++;
            all_under+=w;
            av_under=all_under/under;
            per_under=(under*100)/N;
            //printf("Underweight ");
            //printf("under = %f ",under);
            //printf("av = %.2f ",av_under);
            //printf("per_w = %.2f%% \n",per_under);
        }
        else if(bmi<25){
            normal++;
            all_normal+=w;
            av_normal=all_normal/normal;
            per_normal=(normal*100)/N;
            //printf("Normal weight ");
            //printf("normal = %f ",normal);
            //printf("av = %.2f ",av_normal);
            //printf("per_w = %.2f%% \n",per_normal);
        }
        else if(bmi<30){
            over++;
            all_over+=w;
            av_over=all_over/over;
            per_over=(over*100)/N;
            //printf("Overweight ");
            //printf("over = %f ",over);
            //printf("av = %.2f ",av_over);
            //printf("per_w = %.2f%% \n",per_over);
        }
        else if(bmi>=30){
            obe++;
            all_obe+=w;
            av_obe=all_obe/obe;
            per_obe=(obe*100)/N;
            //printf("Obesity ");
            //printf("obe = %f ",obe);
            //printf("av = %.2f ",av_obe);
            //printf("per_w = %.2f%% \n",per_obe);
        }
    }
    printf("Underweight %.0f %.2f %.2f%% \n",under,all_under/under,per_under);
    printf("Normal weight %.0f %.2f %.2f%% \n",normal,all_normal/normal,per_normal);
    printf("Overweight %.0f %.2f %.2f%% \n",over,all_over/over,per_over);
    printf("Obesity %.0f %.2f %.2f%% \n",obe,all_obe/obe,per_obe);
    //printf("Underweight %.0f %.2f %.2f%% \n",under,av_under,per_under);
    //printf("Normal weight %.0f %.2f %.2f%% \n",normal,av_normal,per_normal);
    //printf("Overweight %.0f %.2f %.2f%% \n",over,av_over,per_over);
    //printf("Obesity %.0f %.2f %.2f%% \n",obe,av_obe,per_obe);
}

