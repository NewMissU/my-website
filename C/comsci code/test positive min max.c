#include<stdio.h>
//#include<limits.h>
void main()
{
    int x,i=0,max=0,min=0; //��˹�����٧�ش����� 0 ���� ���������ҡ� �Ţ�������Ҩ������ҡ���� max
    //max = INT_MIN INT_MAX = lowest integer value
    while (i<8){
        scanf("%d",&x);
        if(x>0){ // positive ����Ţ�ǡ �ҾԨ�ó� �����ҡ�ش �� 7 3 2 5 20
            if(x>max){      // 7>0 ��� ��      3>7 ��� ���     20 > 7 ��� �� �ѧ��� max = 20 �ѹ����º�Ţ���Ф�� �֧��ͧ�յ�����纤���٧�ش
                max = x;
            }
            if(x<min){
                min = x;
            }
        }
        i++;
    }
    printf("Max : %d\n",max);
    printf("Min : %d\n",min);
}
