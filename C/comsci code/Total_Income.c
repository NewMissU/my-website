#include<stdio.h>
#include<limits.h>
void main()
{
    int day,cancel=0,sum=0,cancelmax=INT_MIN;
    scanf("%d",&day);
    int i=1;
    while(i<=day){
        int hr,dhr=0;
        scanf("%d",&hr);
        if(hr==8){
            sum+=300;
            cancel=0;
        }
        else if(hr>=4 && hr<8){
            sum+=150;
            cancel=0;
        }
        else if(hr>8 && hr<=12){
            dhr+=hr-8;
            sum+=300+(50*dhr);
            cancel=0;
        }
        else if(hr>12){
            sum+=500;
        }
        else if(hr<4){
            cancel++;
            if(cancel==3){
                break;
            }
        }
    //printf("cancel = %d\n",cancel);
    //printf("income = %d\n",sum);
    i++;
    }
    printf("%d",sum);
}
