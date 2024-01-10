#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    int u[1000];
    int v[1000];
    for(int i=0;i<n;i++){
        scanf("%d",&u[i]);
    }

    for(int i=0;i<n;i++){
        scanf("%d",&v[i]);
    }

    int sum_uv[n];
    int value_sumUV;
    for(int i=0;i<n;i++){
        sum_uv[i]=0;
        sum_uv[i]=u[i]*v[i];
        value_sumUV+=sum_uv[i];
    }
    printf("%d",value_sumUV);





}
