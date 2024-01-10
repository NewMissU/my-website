#include<stdio.h>
void main()
{
    int sum4=0,count=0,count4=0;
    while(1){
        int x;
        scanf("%d",&x);
        if(x==-1){
            break;
        }
        if(x==4){
            printf("Alert!! Porn contents\n");
            count4++;
            count++;
        }
        else{
            count++;
        }
    }
    sum4=(count4*100)/count;
    if(sum4>=60){
            printf("The user was banned\n");
        }
}
