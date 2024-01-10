#include<stdio.h>
// array Global
int x[100]; // set <=100
//Function avg
double average(int n)
{
    double sum=0;
    double avg;
    for(int i=0;i<n;i++){
        sum+=x[i];
    }
    avg=sum/n;
    return avg;
}
//Function var
double variance(double avg, int n) //avg from function average
{
    double var=0;
    double summation=0;
    for(int i=0;i<n;i++){
        summation += (x[i]-avg)*(x[i]-avg);
    }
    var = summation/(n-1);
    return var;
}

//Main program
void main()
{
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        scanf("%d",&x[i]);
    }
    //avg
    double avg = average(n);
    //var
    double var = variance(avg,n);
    //output
    printf("%.2lf %.2lf",avg,var);
}
