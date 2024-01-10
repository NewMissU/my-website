#include<stdio.h>
void main()
{
    int day,month,year;
    scanf("%d%d%d",&day,&month,&year);
    int sum=0;

    int d1,d2;
    if(day>=10){
        d1=(day/10)%10;
        d2=day%10;
        sum+=d1+d2;
    }
    else{
        d2=day;
        sum+=d2;
    }

    int m1,m2;
    if(month>=10){
        m1=(month/10)%10;
        m2=month%10;
        sum+=m1+m2;
    }
    else{
        m2=month;
        sum+=m2;
    }

    int y1,y2,y3,y4;
    y1=(year/1000)%10;
    y2=(year/100)%10;
    y3=(year/10)%10;
    y4=year%10;
    sum+=y1+y2+y3+y4;

    printf("%d ",sum);
    int sum1=sum,sum2;
    if(sum>=10){
        sum1=sum/10%10;
        sum2=sum%10;
        printf("%d ",sum1+sum2);
    }
    int sum3,sum4;
    if(sum1+sum2>=10){
        sum3=(sum1+sum2)/10%10;
        sum4=(sum1+sum2)%10;
        printf("%d ",sum3+sum4);
    }
}
