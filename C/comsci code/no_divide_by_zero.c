#include<stdio.h>
void main()
{
    double x,y,z;
    scanf("%lf%lf%lf",&x,&y,&z);
    //          scanf           printf
    //  int     %d              %d
    //  float   %f              %f
    // double   %lf (long f)    %lf = %f
    if (z!=0){
        double sum;
        sum = (x+y)/z;
        printf("%.6lf",sum);
    }
    else{
        printf("cannot divide by zero");
    }
}
