#include<stdio.h>
int f(int x,int y,int z){
    x= x*2;
    y= x+y+z;
    z= z-x-y;
    return z+y;
}

void main()
{
    int x= 2;
    int y= -2;
    int z= 1;
    printf("1 : %d\n",f(1,2,-1));
    z = f(z,0,z+x);
    y = f(x,y,-z);
    printf("2 : %d\n",f(x,y,z));
    printf("3 : %d\n",z);
    printf("4 : %d\n",y);
    return 0;
}

