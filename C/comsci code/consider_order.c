#include<stdio.h>
void main()
{
    int x,y;
    scanf("%d%d",&x,&y);
    int M,N;
    scanf("%d%d",&M,&N);
    int bx=0,by=0,btable=0;
    int sx=0,sy=0,stable=0;
    bx=x/2;
    by=y/6;
    sx=x;
    sy=y/4;
    if(bx<by && sx<sy){
        btable=bx;
        stable=sx;
        if(btable==M && stable==N);

    }

}
