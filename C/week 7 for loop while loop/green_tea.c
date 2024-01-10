#include<stdio.h>
void main()
{
    int pro_w,pro_s,product;
    for(int i=1;i<=7;i++){
        int water,sugar;
        scanf("%d%d",&water,&sugar);
        pro_w=water/250;
        pro_s=sugar/15;
        if(pro_w<pro_s){
            product=pro_w;
        }
        else{
            product=pro_s;
        }
        if(water-product*250 > 0){
            printf("%d water\n",product);
        }
        else{
            printf("%d\n",product);
        }

    }
}
