#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        int x,y,z;
        scanf("%d%d%d",&x,&y,&z);
        if(x==y && x==z && y==z){
            printf("xyz\n");
        }
        else if(x==y && x!=z){
            printf("xy\n");
        }
        else if(x==z && x!=y){
            printf("xz\n");
        }
        else if(y==z && y!=x){
            printf("yz\n");
        }
        else if(x>y && x>z){
            printf("x\n");
        }
        else if(y>x && y>z){
            printf("y\n");
        }
        else if(z>x && z>y){
            printf("z\n");
        }
    }
}
