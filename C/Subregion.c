#include<stdio.h>
void main()
{
    int row,col;
    scanf("%d%d",&row,&col);
    char area[row+1][col+1];
    for(int r=1;r<=row;r++){
        for(int c=1;c<=col;c++){
            area[r][c]='0';
        }
    }
    //top left corner
    int p,q;
    scanf("%d%d",&p,&q);

    //area small
    int h,w;
    scanf("%d%d",&h,&w);

    int check=1;
    if(p<=0||q<=0||h<=0||w<=0||p+h-1>row||q+w-1>col){
        check=0;
    }

    for(int r=p;r<=p+h-1;r++){
        for(int c=q;c<=q+w-1;c++){
            area[r][c]='1';
        }
    }

    if(check == 1){
        for(int r=1;r<=row;r++){
            for(int c=1;c<=col;c++){
                printf("%c ",area[r][c]);
            }
            printf("\n");
        }
    }
    else if(check==0){
        printf("invalid input");
    }


}
