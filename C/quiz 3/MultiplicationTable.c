#include<stdio.h>
void main()
{
    int a,mul,b,mul2;
    int summul,summul2;
    scanf("%d%d%d%d",&a,&mul,&b,&mul2);
    int mul3=mul;
    for(int i=a;i<=b;i++){
            if(i<b){
                for(int j=mul;j<=mul2;j++){
                summul=i*j;
                printf("%d x %d = %d",i,j,summul);
                printf("\n");
                }
            }
            else if(i==b){
               for(int k=1;k<=mul3;k++){
                summul=i*k;
                printf("%d x %d = %d",i,k,summul);
                printf("\n");
            }
        }
    mul=1;
    }
}
