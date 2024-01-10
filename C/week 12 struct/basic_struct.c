#include<stdio.h>
// typedef struct {body} name;
typedef struct{
    int x;
    double y;
} testStruct;

void main(){
    //int x
    testStruct a;
    //x=5 , y=1.23
    a.x=5;
    a.y=1.23;
    printf("%d %f",a.x,a.y);
}
