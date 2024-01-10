#include<stdio.h>
void main()
{
    int unit;
    int n;
    scanf("%d",&n);
    //printf("%d\n",unit);
    int d=n;
    if(n<=500){
        unit=d%10;
        for(int i=1;i<=n;i++){
            for(int k=1;k<d;k++){
                printf("%d",unit);
            }
            printf("%d",unit);
            printf("\n");
            d--;
            unit=d%10;
        }
    }
   /* if(n>=10 && n<=500){
        unit=n%10;
        for(int j=1;j<=n;j++){
            printf("%d",unit);
        }
    }*/
}
