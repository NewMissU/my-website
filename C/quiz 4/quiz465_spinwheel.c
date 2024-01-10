#include<stdio.h>
void main()
{
    int score[10];
    for(int i=0;i<10;i++){
        scanf("%d",&score[i]);
    }
    int F;
    scanf("%d",&F);
    int times_spin=F/10;
    int mod = times_spin%10;
    printf("%d",score[mod]);
}
