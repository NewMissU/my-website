#include<stdio.h>
struct pokemon{
    int code;
    char name[51];
    int level_power[9];
}typedef poke;

void main()
{
    int n;
    scanf("%d",&n);
    poke mon[200];
    for(int i=0;i<n;i++){
        scanf("%d",&mon[i].code);
        scanf("%s",mon[i].name);
        for(int j=0;j<8;j++){
            scanf("%d",&mon[i].level_power[i]);
        }
    }

    int k;
    scanf("%d",&k);
    int found_mon[k];
    int level;
    for(int i=0;i<k;i++){
        scanf("%d",&found_mon[i]);
        scanf("%d",&level);
        for(int j=0;j<n;j++){
            if(mon[j].code==found_mon[i]){
                printf("%s %d\n",mon[j].name,mon[j].level_power[level]);
            }
        }
    }
}
