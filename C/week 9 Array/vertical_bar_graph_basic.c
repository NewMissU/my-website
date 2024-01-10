#include<stdio.h>
#include<limits.h>
void main()
{
    int max=INT_MIN;
    int n;
    scanf("%d",&n);
    int x[n];
    for(int i=0;i<n;i++){
        scanf("%d",&x[i]);
        if(x[i]>max){
            max=x[i];
        }
    }

}
