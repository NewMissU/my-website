#include<stdio.h>
#include<limits.h>
struct medal_struct{
    int code;
    int goldmedal;
    int silvermedal;
    int bronzemedal;
}typedef Medal;

void main()
{
    int n;
    scanf("%d",&n);
    Medal medal[n];
    int sum_medal[n];
    for(int i=0;i<n;i++){
        sum_medal[i]=0;
    }

    for(int i=0;i<n;i++){
        scanf("%d",&medal[i].code);
        scanf("%d",&medal[i].goldmedal);
        scanf("%d",&medal[i].silvermedal);
        scanf("%d",&medal[i].bronzemedal);
        sum_medal[i]+=medal[i].goldmedal+medal[i].silvermedal+medal[i].bronzemedal;
    }

    //max gold medal 1001
    int maxgoldmedal=INT_MIN;
    for(int i=0;i<n;i++){
        if(medal[i].goldmedal>maxgoldmedal){
            maxgoldmedal=medal[i].goldmedal;
        }
    }

    //max silver medal 1002
    int maxsilvermedal=INT_MIN;
    for(int i=0;i<n;i++){
        if(medal[i].silvermedal>maxsilvermedal){
            maxsilvermedal=medal[i].silvermedal;
        }
    }

    //max bronze medal 1003
    int maxbronzemedal=INT_MIN;
    for(int i=0;i<n;i++){
        if(medal[i].bronzemedal>maxbronzemedal){
            maxbronzemedal=medal[i].bronzemedal;
        }
    }

    //max sum_medal all country
    int max_medal=INT_MIN;
    for(int i=0;i<n;i++){
        if(sum_medal[i]>max_medal){
            max_medal=sum_medal[i];
        }
    }


    for(;;){
        int x;
        scanf("%d",&x);
        if(x<=0){
            printf("good bye");
            break;
        }
        int stop=0;
        for(int i=0;i<n;i++){
            if(x==medal[i].code){
                printf("%d ",medal[i].goldmedal);
                printf("%d ",medal[i].silvermedal);
                printf("%d ",medal[i].bronzemedal);
                printf("%d\n",sum_medal[i]);
                stop=1;
            }
        }

        if(x==1001){
            for(int i=0;i<n;i++){
                if(maxgoldmedal==medal[i].goldmedal){
                    printf("%d ",medal[i].code);
                }
            }
            printf("\n");
            stop=1;
        }
        else if(x==1002){
            for(int i=0;i<n;i++){
                if(maxsilvermedal==medal[i].silvermedal){
                    printf("%d ",medal[i].code);
                }
            }
            printf("\n");
            stop=1;
        }
        else if(x==1003){
            for(int i=0;i<n;i++){
                if(maxbronzemedal==medal[i].bronzemedal){
                    printf("%d ",medal[i].code);
                }
            }
            printf("\n");
            stop=1;
        }
        else if(x==2000){
            for(int i=0;i<n;i++){
                if(sum_medal[i]==max_medal){
                    printf("%d ",medal[i].code);
                }
            }
            printf("\n");
            stop=1;
        }
        else if(x==3000){
            for(int i=0;i<n;i++){
                if(sum_medal[i]>0){
                    printf("%d ",medal[i].code);
                }
            }
            printf("\n");
            stop=1;
        }
        if(stop==0){
            printf("invalid code\n");
        }
    }
}
