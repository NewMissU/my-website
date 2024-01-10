#include <stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    int x[n];
    for(int i=0;i<n;i++){
        scanf("%d",&x[i]);
    }
    int s,r;
    scanf("%d%d",&s,&r);
    int a=(s+r)%n;
    if(a==0){
        a=n-1;
    }
    else{
        a-=1;
    }
    printf("%d",x[a]);
}
