#include<stdio.h>
#include<limits.h>
void main()
{
    int max=INT_MIN; //-20000
    int x;
    scanf("%d",&x);
    for(int i=1;i<=12;i++){
        if(x<1 && x>99){
            printf("Number is out of range");
            break;
        }
        int mul=x*i;
        if(mul>max){
            max=mul;
            //printf("max = %d\n",max);
        }
        printf("%d x %2d = %d\n",x,i,mul);
    }

}
