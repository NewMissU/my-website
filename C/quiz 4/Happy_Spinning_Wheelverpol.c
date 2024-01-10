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
    int a=((s+r)%n)-1;      // 4
    for(int i=0;i<n;i++){       // 0 1 2 3
        if(i==a){
            printf("%d",x[i]);
        }
    }
}
