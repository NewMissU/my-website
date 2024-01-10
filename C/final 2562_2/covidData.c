#include<stdio.h>
struct covid19{
    int id;
    char country[31];
    int amountInfect;
    int amountDead;
}typedef COVID;

COVID covid[200];
void main()
{
    int n;
    scanf("%d",&n);

    for(int i=0;i<n;i++){
        scanf("%d",&covid[i].id);
        scanf("%s",covid[i].country);
        scanf("%d",&covid[i].amountInfect);
        scanf("%d",&covid[i].amountDead);
    }

    for(;;){
        int code;
        scanf("%d",&code);
        if(code==0){
            break;
        }
        //printf("%d\n",code);
        for(int i=0;i<n;i++){
            if(code==covid[i].id){
                printf("%s ",covid[i].country);
                printf("%d ",covid[i].amountInfect);
                printf("%d\n",covid[i].amountDead);
            }
        }
    }

}
