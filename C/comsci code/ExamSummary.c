#include<stdio.h>
void main()
{
    int count=0,count_pass=0,count_a=0,count_b=0,count_c=0,count_d=0;
    int a,b,c,d;
    scanf("%d%d%d%d",&a,&b,&c,&d);
    int N;
    scanf("%d",&N);
    for(int i=1;i<=N;i++){
        count=0;
        int x1,x2,x3,x4;
        scanf("%d%d%d%d",&x1,&x2,&x3,&x4);
        if(x1>=a){
            //printf("1 ");
            count++;
            count_a++;
        }
        if(x2>=b){
            //printf("2 ");
            count++;
            count_b++;
        }
        if(x3>=c){
            //printf("3 ");
            count++;
            count_c++;
        }
        if(x4>=d){
            //printf("4 ");
            count++;
            count_d++;
        }
        if(count==0){
            //printf("0");
            printf("fail\n");
        }
        else if(count>=3){
            printf("pass\n");
            count_pass++;
        }
        else if(count<3){
            printf("fail\n");
        }
    }
    //printf("count pass = %d\n",count_pass);
    //printf("pass a b c d = %d %d %d %d\n",count_a,count_b,count_c,count_d);
    printf("%d\n",count_pass);
    printf("%d %d %d %d\n",count_a,count_b,count_c,count_d);
}
