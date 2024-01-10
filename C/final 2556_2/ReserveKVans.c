#include<stdio.h>
void main()
{
    int k;
    scanf("%d",&k);
    int van[100];
    for(int i=1;i<=k;i++){
        van[i]=0;
    }

    int n;
    scanf("%d",&n);
    int day;
    for(int i=1;i<=k;i++){
        for(int j=0;j<n;j++){
            scanf("%d",&day);
            van[i]+=day;
        }
        printf("%d\n",van[i]);
    }

}
