#include<stdio.h>
void main()
{
    int c1=0,c2=0,c3=0,c4=0;
    int n;
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        int x;
        scanf("%d",&x);
        if(x==1){
            c1++;
        }
        else if(x==2){
            c2++;
        }
        else if(x==3){
            c3++;
        }
        else if(x==4){
            c4++;
        }
    }
    if(c1>c2 && c1>c3 && c1>c4){
            printf("Thailand won with a score of %d",c1);
        }
    else if(c2>c1 && c2>c3 && c2>c4){
            printf("Taiwan won with a score of %d",c2);
        }
    else if(c3>c1 && c3>c2 && c3>c4){
            printf("Malaysia won with a score of %d",c3);
        }
    else if(c4>c1 && c4>c2 && c4>c3){
            printf("Finland won with a score of %d",c4);
        }
}
