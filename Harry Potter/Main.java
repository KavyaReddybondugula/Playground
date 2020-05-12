#include<iostream>
using namespace std;
int main()
{
  int x,x1,x2;
  cin>>x;
  x=abs(x);
  x1=x%10;
  x2=x/1000;
  cout<<(x1+x2);
}