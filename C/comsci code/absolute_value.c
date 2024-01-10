#include<stdio.h>
void main()
{
    int x;
    scanf("%d",&x);
    //sol1
   // int sum;
   // sum = abs(x);
   // printf("%d",sum); //sol 1.1 printf("%d",abs(x));

    //sol2
//    if(x<0){
//        x = -x;
//    }
//    printf("%d",x);

    //sol3
    if(x>0){
        printf("%d", x);
    }
    else {
        printf("%d", -x);
    }
}

