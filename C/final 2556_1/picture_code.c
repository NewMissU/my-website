#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    int m,c,b;
    double price=0;
    for(int i=0;i<n;i++){
        scanf("%d",&m);
        for(int j=0;j<m;j++){
            scanf("%d%d",&c,&b);
            char draw;
            if(b==0){   //white
                price += c*9.75;
                draw = '#';
            }
            else if(b==1){  //green
                price += c*8.50;
                draw = '-';
            }
            for(int k=0;k<c;k++){
                printf("%c",draw);
            }
        }
        printf("\n");
    }

    printf("%.2lf",price);



}
