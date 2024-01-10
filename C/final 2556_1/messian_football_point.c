#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    char team[38+1];
    for(int i=0;i<n;i++){
        scanf("%s",team);
        int countWin=0,countDraw=0,countLose=0;
        for(int j=0;j<39;j++){
            if(team[j]=='W'){
                countWin++;
            }
            else if(team[j]=='D'){
                countDraw++;
            }
            else if(team[j]=='L'){
                countLose++;
            }
        }
        int sumPast=countWin*2+countDraw*1+countLose*0;
        int sumPresent=countWin*3+countDraw*1+countLose*0;
        int sumMessi=countWin*5+countDraw*1+countLose*-1;
        printf("%d %d %d ",countWin,countDraw,countLose);
        printf("%d %d %d",sumPast,sumPresent,sumMessi);
        printf("\n");
    }

}
