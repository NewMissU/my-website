#include<stdio.h>
void main()
{
    int N;
    scanf("%d",&N);
    int AD=0,nextAD=0,BE=0,nextBE=0;
    for(int i=1;i<=N;i++){
        int x,y;
        scanf("%d%d",&x,&y);
        if(x==0){
            if(y%4==0){
                AD=y;
                printf("%dAD is leap year \n",AD);
            }
            else{
                AD=y;
                printf("%dAD is not leap year. ",AD);
                    while(1){
                        if(y%4==0){
                            break;
                        }
                        y++;
                    }
                nextAD=y;
                printf("The next leap year is %d.\n",nextAD);
            }
        }
        else if(x==1){
            AD=y-543;
            if(AD%4==0){
                printf("%dBE is leap year \n",y);
            }
            else{
                printf("%dBE is not leap year. ",y);
                    while(1){
                        if(AD%4==0){
                            break;
                        }
                        AD++;
                    }
                AD+=543;
                nextBE=AD;
                printf("The next leap year is %d.\n",nextBE);
            }
        }

    }
}

