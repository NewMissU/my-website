#include<stdio.h>
void main(){
    int a[10001],counta=0,countb=0;
    for(int i=0;i<=10000;i++){
        a[i]=0;
    }
    int b[10001];
    for(int i=0;i<=10000;i++){
        b[i]=0;
    }
    int i=0;
    for(;;){
        scanf("%d",&i);
        if(i<0){
            break;
        }
        a[i]+=1;
        i++;
    }
    for(int i=0;i<=10000;i++){
        if(a[i]>0){
            counta++;
        }
    }
    int j=0;
    for(;;){
        scanf("%d",&j);
        if(j<0){
            break;
        }
        b[j]+=1;
        j++;
    }
    for(int i=0;i<=10000;i++){
        if(b[i]>0){
            countb++;
        }
    }
    if(counta==countb){
        printf("A and B are anagrams\n");
    }else{
        printf("A and B are not anagrams\n");
    }
    printf("A %d\n",counta);
    printf("B %d\n",countb);
}


