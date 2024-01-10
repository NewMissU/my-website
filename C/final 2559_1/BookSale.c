#include<stdio.h>
struct Book{
    int id;
    char name[51];
    int saleprice;
    int baseprice;
    int count_sale;
}typedef book;


void main()
{
    int n;
    scanf("%d",&n);
    book books[n];

    for(int i=0;i<n;i++){
        scanf("%d",&books[i].id);
        scanf(" %99[^\n]",books[i].name);
        int nameLength = strlen(books[i].name);
        books[i].name[nameLength-1] = 0;
        scanf("%d",&books[i].saleprice);
        scanf("%d",&books[i].baseprice);
        books[i].count_sale=0; // clean
    }

    int p;
    scanf("%d",&p);
    int code,id;
    int count_code2=0,count=1;

    int TotalQ=0,TotalSalePrice=0,TotalBaseprice=0,TotalProfit=0;
    for(int i=0;i<p;i++){
        scanf("%d",&code);
        if(code == 1){
            scanf("%d",&id);
            scanf("%d",&count);
            for(int j=0;j<n;j++){
                if(id == books[j].id){
                    books[j].count_sale+=count;
                }
            }
            /*TotalQ+=books[i].count_sale;
            TotalSalePrice+=books[i].count_sale*books[i].saleprice;
            TotalBaseprice+=books[i].count_sale*books[i].baseprice;
            printf("TotalQ : %d ",TotalQ);
            printf("TotalSalePrice : %d ", TotalSalePrice);
            printf("TotalBaseprice : %d\n",TotalBaseprice);*/
        }
        else if(code == 2){
            int sum=0;
            scanf("%d",&id);
            for(int j=0;j<n;j++){
                if(id == books[j].id){

                    printf("%d ",books[j].id);
                    printf("%s ",books[j].name);
                    printf("%d ",books[j].count_sale);

                    TotalSalePrice=books[j].count_sale*books[j].saleprice;
                    TotalBaseprice=books[j].count_sale*books[j].baseprice;
                    TotalProfit=TotalSalePrice-TotalBaseprice;

                    printf("%d ",TotalSalePrice);
                    printf("%d ",TotalProfit);
                    printf("\n");
                    sum=1;
                }
            }
            if(sum==0){
                printf("Error\n");
            }
        }
    }
}
