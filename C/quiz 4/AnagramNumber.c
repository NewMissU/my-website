#include<stdio.h>
void main()
{
    int arrA[100],arrB[100];
    for(int i=0;i<100;i++){
        arrA[i]=0;
        arrB[i]=0;
    }
    int counta=0;
    while(1){
        int a;
        scanf("%d",&a);
        //counta++;
        if(a<0){
            break;
        }
        if(counta==0){
            arrA[0]=a;
            counta++;
        }
        else {
            int check=0;
            for(int i=0;i<counta;i++){
                if(a==arrA[i]){
                    check++;
                }
                if(check==0){
                    arrA[counta]=a;
                    counta++;
                }
            }
        }
    }
    int countb=0;
    while(1){
        int b;
        scanf("%d",&b);
        //countb++;
        if(b<0){
            break;
        }
        if(countb==0){
            arrB[0]=b;
            countb++;
        }
        else {
            int check=0;
            for(int i=0;i<countb;i++){
                if(b==arrB[i]){
                    check++;
                }
                if(check==0){
                    arrB[countb]=b;
                    countb++;
                }
            }
        }
    }
    for(int i=0;i<counta;i++){
        printf("A %d\n",arrA[i]);
    }
    for(int i=0;i<countb;i++){
        printf("B %d\n",arrB[i]);
    }
}
