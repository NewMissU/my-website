#include<stdio.h>
void main()
{
    int h,m,h2,m2;
    scanf("%d%d%d%d",&h,&m,&h2,&m2);
    for(int i=h;i<=h2;i++){
        if(i<h2){
            for(int j=m;j<=59;j++){
                if(j<10){
                    printf("%d:0%d",i,j);
                    printf("\n");
                }
                else{
                    printf("%d:%d",i,j);
                    printf("\n");
                }
            m=0;
            }
        }
        if(i==h2){
            for(int j=m;j<=m2;j++){
                if(j<10){
                printf("%d:0%d",i,j);
                printf("\n");
                }
                else{
                printf("%d:%d",i,j);
                printf("\n");
                }
            }
            m=0;
        }
    }
}
