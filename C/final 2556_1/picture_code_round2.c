#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    double price=0;
    for(int i=0;i<n;i++){
        int m;
        scanf("%d",&m);
        for(int j=0;j<m;j++){
            int c,b;
            scanf("%d%d",&c,&b);
            if(b==0){   //0 white # 9.75 baht
                for(int k=0;k<c;k++){
                    price += 9.75;
                    printf("#");
                }
            }
            else if(b==1){ // 1 green - 8.50 baht
                for(int k=0;k<c;k++){
                    price += 8.50;
                    printf("-");
                }
            }
        }
        printf("\n");
    }
    printf("%.2lf",price);
}
