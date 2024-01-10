#include<stdio.h>
void main()
{
    int x,y,z;
    scanf("%d%d%d",&x,&y,&z);
    int f=0;
    if(x/3<y/4 && x/3<z/2){
        f=x/3;
        printf("%d ",f);
    }
    else if(y/4<x/3 && y/4<z/2){
        f=y/4;
        printf("%d ",f);
    }
    else if(z/2<x/3 && z/2<y/4){
        f=z/2;
        printf("%d ",f);
    }
    int lx=0,ly=0,lz=0;
    lx=x-(f*3);
    ly=y-(f*4);
    lz=z-(f*2);
    printf("%d %d %d",lx,ly,lz);
}
