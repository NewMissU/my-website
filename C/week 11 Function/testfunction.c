#include<stdio.h>
// output function_name(input){.....}
void printMe()
{
    printf("Test\n");
}
void printMe2(int y)
{
    printf("Test\n");
    printf("y=%d\n",y);
}
int printMe3(int x) //void not return value // use int for return
{
    x+=5;
    printf("printMe3 : x=%d\n",x);
    return x;   //return need receptor
}
void main()
{
    //printMe();
    int x = 10;
    printf("Main : x=%d\n",x);
    //printMe2(x);
    int y = printMe3(x); // receptor = y
    printf("Main : x=%d y=%d\n",x,y);
}
