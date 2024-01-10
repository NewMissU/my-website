#include<stdio.h>
void main()
{
    int a,b,c,vol;
    scanf("%d%d%d",&a,&b,&c);
    int box1=15*10*8;  //1200
    int box2=25*15*12; //4500
    int box3=50*40*20; //40000
    vol=a*b*c;
    if(a<=15&&b<=10&&c<=8){
        printf("1\n%d",box1-vol);
    }
    else if(a<=25&&b<=15&&c<=12){
        printf("2\n%d",box2-vol);
    }
    else if(a<=50&&b<=40&&c<=20){
        printf("3\n%d",box3-vol);
    }
    else{
        printf("Oversize product\n%d",vol-box3);
    }
}
