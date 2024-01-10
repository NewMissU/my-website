#include<stdio.h>
void main()
{
    int count=0, target;
    scanf("%d",&target);
    while(1){
        int x;
        scanf("%d",&x);

        if(x==0){
            break;
        }
        if(x==target){
            count++;
        }
    }
    if(count==0){
            printf("None");
        }
    else{
        printf("%d",count);
    }
}
/*{
    int target,count=0;
    scanf("%d",&target);
    while(1){
        int x;
        scanf("%d",&x);
        if(x==0){
            break;
        }
        if(target==x){
            count++;
        }
    }
    if(count==0){
            printf("None");
        }
    printf("%d",count);
}
*/
