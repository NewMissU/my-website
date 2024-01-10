#include<stdio.h>
void main()
{
    int k,k1,k2,s1,s2,g;
    scanf("%d%d%d%d%d%d",&k,&k1,&k2,&s1,&s2,&g);
    if(g==1){
        //printf("1");
        if(s1>=9 && k1<k){
            printf("1");
        }
        else if(k1==k && k2!=k && s2>=9){
            printf("2");
        }
        else {
            printf("0");
        }
    }
    else if(g==2){
        //printf("2");
        if(s2>=9 && k2<k){
            printf("2");
        }
        else if(k1!=k && k2==k && s1>=9){
            printf("1");
        }
        else {
            printf("0");
        }
    }
    else{
        printf("0");
    }
}

