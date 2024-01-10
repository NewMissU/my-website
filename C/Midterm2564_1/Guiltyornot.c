#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        int yes=0,no=0;
        for(int a=1;a<=5;a++){
            int x,y;
            scanf("%d%d",&x,&y);
            if(x==1 && y==0){
                yes++;
            }
            if(x==1 && y==1){
                no++;
            }
            if(x==0 && y==0){
                no++;
            }
            if(x==0 && y==1){
                no++;
            }
        }
        if(yes>no){
            printf("Case#%d was guilty\n",i);
        }else{
            printf("Case#%d was not guilty\n",i);
        }
    }
}
