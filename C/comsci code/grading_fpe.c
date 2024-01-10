#include<stdio.h>
void main()
{
    int x;
    scanf("%d",&x);
    if (x<40){
        printf("Fail");
    }
    else if (x<80){
        printf("pass");
    }
    else{ // else if(x>=80){
        printf("Excellent");
    }
}
