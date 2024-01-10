#include<stdio.h>
void main()
{
    int h,m,h2,m2;
    scanf("%d%d%d%d",&h,&m,&h2,&m2);
    for(int i=h;i<=h2;i++){
        for(int j=m;j<=59;j++){
            if(j<10){
                printf("%d:0%d",i,j);
                printf("\n");
            }
            else{
                printf("%d:%d",i,j);
                printf("\n");
            }
            if(i==h2 && j==m2){
                break;
            }
        }
    m=0;
    }
}
