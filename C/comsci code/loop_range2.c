#include<stdio.h>
void main()
{
    int x,y;
    scanf("%d%d",&x,&y);
    if(x<=y){
        while(x<=y){
        printf("%d ",x); // x= 1 y= 5 --> 1 2 3 4 5 ������� x �������� ����� y x++
        x++;
        }
    }
    else if (x>y){
        while(x>=y){        // x= 5 y=1 --> 5 4 3 2 1 Ŵ��� x ŧ�������� ����� y x--
        printf("%d ",x);
        x--;
    }
}
}
