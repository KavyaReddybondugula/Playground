#include<iostream>
using namespace std;
int main()
{
  int n,c1=0,c2=0;
  cin>>n;
  int a[n];
  for(int j=0;j<n;j++){
    cin>>a[j];
  }
  for(int i=0;i<n;i++){
    if (a[i]%2==0){
      c1+=a[i];
    }
    else{
      c2+=a[i];
    }
  }
  cout<<"The sum of the even numbers in the array is "<<c1<<"\n";
  cout<<"The sum of the odd numbers in the array is "<<c2;
}
