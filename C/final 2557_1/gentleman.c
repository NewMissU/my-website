#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    char str[n+1];
    scanf("%s",str);
    int countF=0;
    for(int i=0;i<n;i++){
        if(str[i]=='F'){
            countF++;
        }
    }
    //printf("countF : %d\n",countF);
    int count=0;
    for(;;){
        int endF=0;
        for(int i=0;i<countF;i++){
            if(str[i]!='F'){
                endF=1;
            }
        }
        if(endF==0){
            break;
        }
        //check 1 by 1
        for(int i=0;i<n+1;i++){
            if(str[i]=='M' && str[i+1]=='F'){
                str[i]='F';
                str[i+1]='M';
                i++;
            }
            //printf("\n%s\n",str);
        }
        count++;
    }
    printf("%d",count);
}
