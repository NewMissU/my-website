#include<stdio.h>
void main(){
    int r,c;
    scanf("%d %d",&r,&c);
    char a[r][c];
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            a[i][j]=' ';
        }
    }
    for(int i=0;i<r;i++){// print * x
        a[i][i]='*';
    }
    int f=r-1;
    for(int i=0;i<r;i++){//print * x
        a[i][f]='*';
        f--;
    }
    int s=c-r;
    for(int i=0;i<r;i++){//print # x
        a[i][s]='#';
        s++;
    }
    int q=c-1;
    for(int i=0;i<r;i++){//print # x
        a[i][q]='#';
        q--;
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            printf("%c",a[i][j]);
        }
        printf("\n");
    }
    int sum=c-r;
    if(sum==0){
        printf("%d",2*r-1);// tub gun tuk aun
    }else if(sum%2==0&&sum<r){
        printf("2");// tub gun 2 aun
    }else{
        printf("0");// mai tub loey
    }
}
