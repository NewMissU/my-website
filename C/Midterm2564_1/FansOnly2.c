#include<stdio.h>
#include<limits.h>
void main()
{
    int sum4=0,count=0,count4=0,countban=0,maxban=INT_MIN;
    while(1){
        int x;
        scanf("%d",&x);
        if(x==-1){
            break;
        }
        if(x==4){
            //printf("Alert!! Porn contents\n");
            count4++;
            count++;
            countban++;
            if(countban>maxban){
                maxban=countban;
            }
        }
        else{
            count++;
            countban=0;
        }
        //printf("maxban = %d\n",maxban);
    }
    //maxban=countban;
    //printf("maxban = %d\n",maxban);
    sum4=(count4*100)/count;
    /*if(sum4>=60){
            printf("The user was banned\n");
        }*/
    if(sum4>=60 && maxban>=3 ){
        printf("The user was banned\n");
    }
    else if(sum4>=60 || maxban>=3){
        printf("The user was warned\n");
    }
    else{
        printf("Pass\n");
    }
}
