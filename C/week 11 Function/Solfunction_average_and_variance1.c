#include<stdio.h>
//Sol 2 function
// array Global
int x[8];
//Function avg
double average()
{
    double sum=0;
    double avg;
    for(int i=0;i<8;i++){
        sum+=x[i];
    }
    avg=sum/8;
    return avg;
}
//Function var
double variance(double avg) //avg from function average
{
    double var=0;
    double summation=0;
    for(int i=0;i<8;i++){
        summation += (x[i]-avg)*(x[i]-avg);
    }
    var = summation/(8-1);
    return var;
}

//Main program
void main()
{
    int n=8;
    for(int i=0;i<n;i++){
        scanf("%d",&x[i]);
    }
    //avg
    double avg = average();
    //var
    double var = variance(avg);
    //output
    printf("%.2lf %.2lf",avg,var);
}
