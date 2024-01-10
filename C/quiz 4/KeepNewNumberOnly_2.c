#include<stdio.h>
void main()
{
    int arr[1000000];
    for(int i = 0 ; i<1000000; i++)
    {
        arr[i] = 0;
    }
    int count=0;
    int check = 1;
    int number;
    for(;;)
    {
        scanf("%d",&number);
        if(number <= 0)
        {
            break;
        }
        arr[count] = number;

        count++;
    }
    for(int i=0; i<count; i++)
    {
        if(check == 0)
        {
            printf("%d",arr[i]);
            check = 1;
        }
    }
}
