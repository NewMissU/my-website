#include<stdio.h>
void main()
{
    int sumv1,sumv2,sumv3;
    int N,count1=0,count2=0,count3=0;
    scanf("%d",&N);
    for(int i=1;i<=N;i++){
        int a,b,c,vol,vol1,vol2,vol3;
        scanf("%d%d%d",&a,&b,&c);
        int box1=15*10*8;  //1200
        int box2=25*15*12; //4500
        int box3=50*40*20; //40000
        vol=a*b*c;
        vol1=box1-vol;
        vol2=box2-vol;
        vol3=box3-vol;
        if(a<=15&&b<=10&&c<=8){
            printf("1\n");
            count1++;
            sumv1+=vol1;
        }
        else if(a<=25&&b<=15&&c<=12){
            printf("2\n");
            count2++;
            sumv2+=vol2;
        }
        else if(a<=50&&b<=40&&c<=20){
            printf("3\n");
            count3++;
            sumv3+=vol3;
        }
        else{
            printf("Oversize product\n");
        }
        //printf("c1 = %d c2 = %d c3 = %d\n",count1,count2,count3);
    }
    printf("%d %d\n",count1,sumv1);
    printf("%d %d \n",count2,sumv2);
    printf("%d %d \n",count3,sumv3);
}
