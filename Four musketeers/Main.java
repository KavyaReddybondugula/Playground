#include<iostream>
using namespace std;
int main()
{
 int x1,y1,x2,y2,x3,y3;
  cin>>x1>>y1>>x2>>y2>>x3>>y3;
  double x=(x1+x2+x3);
  double y=(y1+y2+y3);
  cout<<x/3<<"\n"<<y/3;
}